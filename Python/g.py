from numpy import asarray
from sklearn.preprocessing import StandardScaler
from sklearn.preprocessing import MinMaxScaler
data= asarray([[1,3],[8,5],[6,7],[8,9]])
print(data)
a=StandardScaler()
b=MinMaxScaler()
c=a.fit_transform(data)
print("================================================")
d=b.fit_transform(data)