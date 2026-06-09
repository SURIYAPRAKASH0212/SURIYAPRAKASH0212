import urllib.request
urls = [
    "https://leetcard.jacoblin.cool/SURIYA0212?theme=radical&font=Fira%20Code&ext=activity",
    "https://leetcard.jacoblin.cool/SURIYA0212?theme=radical&font=Fira%20Code&extension=activity"
]
for u in urls:
    try:
        req = urllib.request.Request(u, headers={'User-Agent': 'Mozilla/5.0'})
        res = urllib.request.urlopen(req)
        body = res.read().decode('utf-8')
        print(f"URL: {u}")
        print(f"Status: {res.status}")
        print(f"Body length: {len(body)}")
        print(f"Contains 'Active Days': {'Active Days' in body or 'active' in body.lower()}")
        print(f"Contains 'error': {'error' in body.lower()}")
        print("-" * 50)
    except Exception as e:
        print(f"FAIL {e}: {u}")
