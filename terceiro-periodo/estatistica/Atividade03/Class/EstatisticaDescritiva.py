import math
from collections import Counter


class EstatisticaDescritiva:
    """
    A class for performing descriptive statistics on a list of numbers.

    Attributes:
        numbers (list): The list of numbers to perform statistics on.
    """

    def __init__(self, numbers):
        self.numbers = sorted(numbers)

    def order_list(self):
        """
        Returns the ordered list of numbers.

        Returns:
            list: The ordered list of numbers.
        """
        return self.numbers

    def mean(self):
        """
        Calculates the mean of the numbers.

        Returns:
            float: The mean of the numbers.
        """
        list_sum = sum(self.numbers)
        n = len(self.numbers)
        list_mean = round(list_sum / n, 3)
        description = f"1. Soma dos números: {list_sum}\n2. Quantidade de números: {n}\n3. Média (soma / quantidade): {list_mean}"
        print("Cálculo da média:\n" + description)
        return list_mean

    def median(self):
        """
        Calculates the median of the numbers.

        Returns:
            float: The median of the numbers.
        """
        n = len(self.numbers)
        if n % 2 == 1:
            list_median = round(self.numbers[n // 2], 3)
            description = f"1. Quantidade ímpar de elementos\n2. Elemento do meio (posição {n // 2}): {list_median}"
        else:
            list_median = round(
                (self.numbers[n // 2 - 1] + self.numbers[n // 2]) / 2, 3
            )
            description = f"1. Quantidade par de elementos\n2. Elementos do meio: {self.numbers[n // 2 - 1]} e {self.numbers[n // 2]}\n3. Média dos elementos do meio: {list_median}"
        print("Cálculo da mediana:\n" + description)
        return list_median

    def mode(self):
        """
        Calculates the mode of the numbers.

        Returns:
            list: The mode(s) of the numbers.
        """
        counter = Counter(self.numbers)
        max_freq = max(counter.values())
        list_mode = [num for num, freq in counter.items() if freq == max_freq]
        description = f"1. Frequências: {dict(counter)}\n2. Maior frequência: {max_freq}\n3. Moda: {list_mode} (número(s) com maior frequência)"
        print("Cálculo da moda:\n" + description)
        return list_mode

    def variance(self):
        """
        Calculates the variance of the numbers.

        Returns:
            float: The variance of the numbers.
        """
        mean = sum(self.numbers) / len(self.numbers)
        list_sum = sum((x - mean) ** 2 for x in self.numbers)
        list_var = round(list_sum / len(self.numbers), 3)
        description = f"1. Média dos números: {mean}\n2. Somatório das diferenças quadradas: {list_sum}\n3. Variância (somatório / quantidade): {list_var}"
        print("Cálculo da variância:\n" + description)
        return list_var

    def std(self):
        """
        Calculates the standard deviation of the numbers.

        Returns:
            float: The standard deviation of the numbers.
        """
        list_var = self.variance()
        list_std = round(math.sqrt(list_var), 3)
        description = f"1. Variância: {list_var}\n2. Desvio padrão (raiz quadrada da variância): {list_std}"
        print("Cálculo do desvio padrão:\n" + description)
        return list_std

    def symmetry(self):
        """
        Determines the symmetry of the distribution.

        Returns:
            str: The description of the symmetry of the distribution.
        """
        mean = self.mean()
        median = self.median()
        mode_result = self.mode()

        if len(mode_result) > 1:
            mode = "multimodal"
        elif len(mode_result) == 1:
            mode = mode_result[0]
        else:
            mode = None

        if mode not in ["multimodal", None]:
            if mean == median == mode:
                result = "simétrica"
            elif mean > median > mode or mean < median < mode:
                result = "direita" if mean > median else "esquerda"
            else:
                result = "indeterminada"
        else:
            result = "indeterminada"

        match result:
            case "simétrica":
                description = "A distribuição é simétrica."
            case "direita":
                description = "A distribuição é assimétrica para a direita (positiva)."
            case "esquerda":
                description = "A distribuição é assimétrica para a esquerda (negativa)."
            case _:
                description = (
                    "A distribuição pode não ser claramente simétrica ou assimétrica."
                )

        print("Determinação da simetria:\n" + description)
        return description
