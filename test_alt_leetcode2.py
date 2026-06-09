import urllib.request
import re
urls = [
    "https://leetcode-stats.vercel.app/api?username=SURIYA0212",
    "https://leetcode-stats.vercel.app/api?username=SURIYA0212&theme=Dark",
    "https://leetcode-stats-api.herokuapp.com/api?username=SURIYA0212",
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
        for t in texts:
            print(f"  - {t}")
        print("-" * 50)
    except Exception as e:
        print(f"FAIL {e}: {u}")
