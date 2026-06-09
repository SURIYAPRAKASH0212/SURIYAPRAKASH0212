import urllib.request
urls = [
    "https://upload.wikimedia.org/wikipedia/commons/3/31/NumPy_logo_2020.svg",
    "https://upload.wikimedia.org/wikipedia/commons/e/ed/Pandas_logo.svg",
    "https://matplotlib.org/stable/_static/logo_light.svg",
    "https://matplotlib.org/stable/_static/logo2.svg",
    "https://seaborn.pydata.org/_images/logo-mark-lightbg.svg",
    "https://upload.wikimedia.org/wikipedia/commons/0/05/Scikit_learn_logo_small.svg"
]
for u in urls:
    try:
        req = urllib.request.Request(u, headers={'User-Agent': 'Mozilla/5.0'})
        res = urllib.request.urlopen(req)
        print(f"OK {res.status}: {u}")
    except Exception as e:
        print(f"FAIL {e}: {u}")
