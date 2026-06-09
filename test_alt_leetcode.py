import urllib.request
import re
urls = [
    "https://leetcode-stats-six.vercel.app/api?username=SURIYA0212&theme=dark",
    "https://leetcode-stats-six.vercel.app/?username=SURIYA0212&theme=dark",
    "https://github-readme-leetcode-card.romitsagu.com/api?username=SURIYA0212&theme=dark",
    "https://github-readme-leetcode-card.romitsagu.com/?username=SURIYA0212&theme=dark",
]
for u in urls:
    try:
        req = urllib.request.Request(u, headers={'User-Agent': 'Mozilla/5.0'})
        res = urllib.request.urlopen(req)
        body = res.read().decode('utf-8')
        print(f"URL: {u}")
        print(f"Status: {res.status}")
        texts = re.findall(r'<text[^>]*>(.*?)</text>', body)
        print("Text elements:")
        for t in texts[:10]:
            print(f"  - {t}")
        print("-" * 50)
    except Exception as e:
        print(f"FAIL {e}: {u}")
