import numpy as np
from sklearn.naive_bayes import GaussianNB
x=np.array([[-1,-1],[-1,-2],[-3,-2],[1,1],[1,2],[2,5]])
y=np.array([1,1,1,2,2,2])
clf=GaussianNB().fit(x,y)
print(clf.predict([[-0.5,-3],[9.8,5]]))
xte,yte=[[-0.5,-3],[9.8,5]],[1,1]
print("================================")
print(clf.score(xte,yte))