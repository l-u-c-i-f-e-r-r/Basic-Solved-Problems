import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
from sklearn.linear_model import LinearRegression
from sklearn.model_selection import train_test_split
import sklearn.metrics

d=pd.read_csv("ex3.csv")
x=d[['volume','weight']]
y=d['co2']
xtr,xte,ytr,yte=train_test_split(x,y,test_size=1/3)
reg=LinearRegression().fit(xtr,ytr)
xp=reg.predict(xtr)
yp=reg.predict(xte)
plt.plot(xtr,xp,color="red")
plt.xlabel("volume&weight")
plt.ylabel("co2")
plt.show()