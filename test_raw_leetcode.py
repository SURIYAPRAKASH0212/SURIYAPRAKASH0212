import urllib.request
import json
url = "https://leetcode-stats-api.herokuapp.com/SURIYA0212"
try:
    req = urllib.request.Request(url, headers={'User-Agent': 'Mozilla/5.0'})
    res = urllib.request.urlopen(req)
    data = json.loads(res.read().decode('utf-8'))
    print(json.dumps(data, indent=2))
except Exception as e:
    print(f"FAIL: {e}")
