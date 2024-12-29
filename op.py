dis = int(input("dis:"))
f = 0

if dis == 0:
    print("fuckkk")
elif dis <= 10:
    f = dis * 10
elif 10 < dis <= 20:
    f = (dis - 10) * 5 + 100
else:
    f = (dis - 20) * 2 + 150

print(f)
