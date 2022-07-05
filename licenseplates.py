myList = []
n = int(input(""))
for i in range(0, n):
    ele = ''.join(chr(i) for i in [int(x) for x in input().split()])
    myList.append(ele) 
def leitura(value):
    if value[0] in '[a-zA-Z0-9_]' and value[3] not in '[0-9]':
       print ("MERCOSUL")
    elif value[3] in '[0-9]':
        print ("ANTIGA")
    else:
        print("ERRO")
for i in myList:
    leitura(i)