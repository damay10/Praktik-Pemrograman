nama = str(input("Masukkan nama lengkap Anda = "))
ipk = str(input("Masukkan IPK Anda = "))
studi = str(input("Lama masa studi Anda = "))

if(float(ipk) >= 3.51 and float(ipk) <= 4 and float(studi) <= 4):
    print("Selamat " + nama + " lulus dengan PUJIAN TERTINGGI (SUMMA CUMLAUDE) dengan IPK " + ipk + " dengan lama studi " + studi + " tahun")
elif(float(ipk) >= 3.51 and float(ipk) <= 4):
    print("Selamat " + nama + " lulus dengan PUJIAN (CUMLAUDE) dengan IPK " + ipk)
elif(float(ipk) >= 3.01 and float(ipk) < 3.51):
    print("Selamat " + nama + " lulus SANGAT MEMUASKAN dengan IPK " + ipk)
elif(float(ipk) >= 2.76 and float(ipk) < 3.01):
    print("Selamat " + nama + " lulus MEMUASKAN dengan IPK " + ipk)
elif(float(ipk) >= 2.00 and float(ipk) < 2.76):
    print("Selamat " + nama + " lulus CUKUP MEMUASKAN dengan IPK " + ipk)
elif(float(ipk) >= 2.00 and float(ipk) < 2.76):
    print("Maaf " + nama + " TIDAK LULUS dengan IPK " + ipk)
    print("Tetap semangat, jangan putus asa!")
elif(float(ipk) > 4 or float(ipk) < 0):
    print("IPK yang Anda input TIDAK VALID")