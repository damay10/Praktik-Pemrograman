a = input("Masukkan nilai A = ")
b = input("Masukkan nilai B = ")
x = True
y = False
print("A == B = " + str(a==b))
print("A != B = " + str(a!=b))
print("A > B = " + str(a>b))
print("A < B = " + str(a<b))
print("A <= B = " + str(a<=b))
print("A >= B = " + str(a>=b))
print(" ")
x = int(a) < 5 and (b) > 4
print("A < 5 and B > 4 = " + str(x))
print("A < 5 or B > 4 = " + str(int(a) <5 or int(b) >4))
print("A < 5 not B > 2 = " + str(not(int(a) <5)))