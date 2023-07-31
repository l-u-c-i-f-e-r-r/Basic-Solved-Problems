import numpy as ny
import pandas as pd
import matplotlib.pyplot as plt
from sklearn.linear_model import LinearRegression
from sklearn.model_selection import train_test_split
from sklearn.metrics import mean_absolute_error, mean_squared_error

d=pd.read_csv("input.csv")
x,y=d.iloc[:,:-1].values,d.iloc[:,1].values
xtr,xte,ytr,yte=train_test_split(x,y,test_size=1/3)

reg=LinearRegression().fit(xtr,ytr)
ypre_tr,ypre_te=reg.predict(xtr),reg.predict(xte)
mae=mean_absolute_error(yte,ypre_te)
mse=mean_squared_error(yte,ypre_te)
rmse=ny.sqrt(mse)

plt.scatter(xtr,ytr,color="green")
plt.plot(xtr,ypre_tr,color="red")
plt.show()