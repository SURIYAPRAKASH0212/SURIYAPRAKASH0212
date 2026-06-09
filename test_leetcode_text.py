import urllib.request
import re
u = "https://leetcard.jacoblin.cool/SURIYA0212?theme=radical&font=Fira%20Code&ext=activity"
req = urllib.request.Request(u, headers={'User-Agent': 'Mozilla/5.0'})
res = urllib.request.urlopen(req)
body = res.read().decode('utf-8')
texts = re.findall(r'<text[^>]*>(.*?)</text>', body)
print("Text elements in SVG:")
for t in texts:
    print(f"  - {t}")
