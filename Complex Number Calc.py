# Complex Number Calculator
# Aim of this program is to overload python operators such as add, subtract, multiple, divide.
class Complex:
    def __init__(self, a, b):
        self.a = a
        self.b = b
        self.x = complex(a, b)

    def __add__(self, right):
        temp_add_a = self.a + right.a
        temp_add_b = self.b + right.b
        temp_add = complex(temp_add_a, temp_add_b)
        return temp_add

    def __sub__(self, right):
        temp_sub_a = self.a - right.a
        temp_sub_b = self.b - right.b
        temp_sub = complex(temp_sub_a, temp_sub_b)
        return temp_sub

    def __mul__(self, right):
        temp_mul_a = (self.a * right.a) - (self.b * right.b)
        temp_mul_b = (self.a * right.b) + (self.b * right.a)
        temp_mul = complex(temp_mul_a, temp_mul_b)
        return temp_mul

    def __truediv__(self, right):
        temp_truediv_a = ((self.a * right.a) + (self.b * right.b)) / ((right.a ** 2) + (right.b ** 2))
        temp_truediv_b = ((self.a * right.b) - (self.b * right.a)) / ((right.a ** 2) + (right.b ** 2))
        temp_truediv = complex(temp_truediv_a, temp_truediv_b)
        return temp_truediv

    def __len__(self):
        temp_len = int((self.a ** 2 + self.b ** 2) ** 0.5)
        return temp_len

    def __gt__(self, right):
        temp_gt = right.x > self.x
        return temp_gt

    def __lt__(self, right):
        temp_gt = right.x < self.x
        return temp_gt


# main
ans = "y"
while ans.lower() in ["y", "yes"]:
    print("=============== Menu ===============")
    print("1. Add Complex Numbers")
    print("2. Subtract Complex Numbers")
    print("3. Multiply Complex Numbers")
    print("4. Divide Complex Numbers")
    print("5. Return the magnitude of a Complex Number")
    print("6. Check if 1st Complex Number is greater than 2nd Complex Number")
    print("7. Check if 1st Complex Number is smaller than 2nd Complex Number")
    print("=============== End ===============")
    inp = int(input("Enter which option to execute :"))
    while inp not in range (1, 8):
        print("This input is not accepted")
        inp = int(input("Enter which option to execute :"))
    if inp == 5:
        print("Enter the complex number")
        a_1 = int(input("Enter the real part of the number :"))
        b_1 = int(input("Enter the imaginary part of the number :"))
        my_inst_1 = Complex(a_1, b_1)
        print("The magnitude of the complex number is", len(my_inst_1))
    else:
        print("Enter the first complex number")
        a_1 = int(input("Enter the real part of the 1st number :"))
        b_1 = int(input("Enter the imaginary part of the 1st number :"))
        print("Enter the second complex number")
        a_2 = int(input("Enter the real part of the 2nd number :"))
        b_2 = int(input("Enter the imaginary part of the 2nd number :"))
        my_inst_1 = Complex(a_1, b_1)
        my_inst_2 = Complex(a_2, b_2)
        if inp == 1:
            c_1 = my_inst_1 + my_inst_2
            print("The sum of two complex numbers is:", c_1)
        elif inp == 2:
            c_2 = my_inst_1 - my_inst_2
            print("The difference of two complex numbers is:", c_2)
        elif inp == 3:
            c_3 = my_inst_1 * my_inst_2
            print("The product of two complex numbers is:", c_3)
        elif inp == 4:
            c_4 = my_inst_1 / my_inst_2
            print("The quotient of two complex numbers is:", c_4)
        elif inp == 6:
            print("Is the 1st complex number greater than the 2nd complex number? ", my_inst_1 > my_inst_2)
        elif inp == 7:
            print("Is the 1st complex number smaller than the 2nd complex number? ", my_inst_1 < my_inst_2)
    ans = input("Do you want to continue? (yes/no) :")
