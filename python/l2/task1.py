name = "Иван Иванов"
hours = 160
rate = 550.5

base_salary = hours * rate
tax = base_salary * 0.13
net_salary = base_salary - tax

print("========== ЧЕК ==========")
print(f"Сотрудник:     {name}")
print("-------------------------")
print(f"Базовая з/п:   {base_salary:10.2f} руб.")
print(f"Налог (13%):   {tax:10.2f} руб.")
print(f"Итого на руки: {net_salary:10.2f} руб.")
print("=========================\n")
