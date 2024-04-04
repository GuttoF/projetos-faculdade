import math
from collections import Counter

import matplotlib.pyplot as plt


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

    def semi_range(self):
        """
        Calculates the semi-range of the numbers.

        Returns:
            float: The semi-range of the numbers.
        """
        max_value = max(self.numbers)
        min_value = min(self.numbers)
        semi_range = (max_value - min_value) / 2
        print(
            f"Cálculo da semi-amplitude:\n1. Valor máximo: {max_value}\n2. Valor mínimo: {min_value}\n3. Semi-amplitude: {semi_range}"
        )
        return semi_range

    def geometric_mean(self):
        """
        Calculates the geometric mean of the numbers.

        Returns:
            float: The geometric mean of the numbers.
        """
        product = math.prod(self.numbers)
        n = len(self.numbers)
        geometric_mean = product ** (1 / n)
        geometric_mean = round(geometric_mean, 3)
        print(
            f"Cálculo da média geométrica:\n1. Produto dos números: {product}\n2. Quantidade de números: {n}\n3. Média geométrica: {geometric_mean}"
        )
        return geometric_mean

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
    
    def coefficient_of_variation(self):
        """
        Calculates the coefficient of variation of the numbers.

        Returns:
            float: The coefficient of variation of the numbers, expressed as a percentage.
        """
        mean = self.mean()  # Reutilizando a função de média.
        std_dev = self.std()  # Reutilizando a função de desvio padrão.
        if mean == 0:
            raise ValueError("A média é zero, o coeficiente de variação não pode ser calculado.")
        cv = (std_dev / mean) * 100
        cv = round(cv, 3)  # Arredondando para 3 casas decimais para consistência.
        description = f"1. Média dos números: {mean}\n2. Desvio padrão: {std_dev}\n3. Coeficiente de variação: {cv}%"
        print("Cálculo do coeficiente de variação:\n" + description)
        return cv
   

    def mean_absolute_deviation(self):
        """
        Calculates the mean absolute deviation of the numbers.

        Returns:
            float: The mean absolute deviation of the numbers.
        """
        mean = self.mean()  # Reutilizando a função de média já definida na classe.
        deviations = [abs(x - mean) for x in self.numbers]
        mad = sum(deviations) / len(self.numbers)
        mad = round(mad, 3)  # Arredondando para 3 casas decimais para consistência.
        description = f"1. Média dos números: {mean}\n2. Desvios absolutos: {deviations}\n3. Desvio absoluto médio: {mad}"
        print("Cálculo do desvio absoluto médio:\n" + description)
        return mad

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

    def skewness(self):
        """
        Calculates the skewness of the numbers.

        Returns:
            float: The skewness of the numbers.
        """
        mean = self.mean()
        std_dev = self.std()
        n = len(self.numbers)
        skewness = (n / ((n - 1) * (n - 2))) * sum(
            ((x - mean) / std_dev) ** 3 for x in self.numbers
        )
        skewness = round(skewness, 3)
        print(f"Cálculo da assimetria: {skewness}")
        return skewness

    def histogram(
        self, bins=10, title="Histograma", xlabel="Valores", ylabel="Frequência"
    ):
        """
        Generates and displays a histogram of the numbers.

        Parameters:
            bins (int): Number of bins in the histogram.
            title (str): Title of the histogram.
            xlabel (str): Label for the x-axis.
            ylabel (str): Label for the y-axis.
        """
        plt.figure(figsize=(10, 6))
        plt.hist(self.numbers, bins=bins, edgecolor="black")
        plt.title(title)
        plt.xlabel(xlabel)
        plt.ylabel(ylabel)
        plt.grid(True, which="both", linestyle="--", linewidth=0.5)
        plt.show()

    def trimmed_mean(self, proportion=0.1):
        """
        Calculates the trimmed mean of the numbers by removing the specified proportion
        of the smallest and largest values.

        Parameters:
            proportion (float): The proportion of values to remove from each end of the sorted list.

        Returns:
            float: The trimmed mean of the numbers.
        """
        n = len(self.numbers)
        trim_count = int(n * proportion)

        # the number of values to trim should never exceed the length of the list
        if trim_count * 2 >= n:
            # garantee that the list will not be empty
            raise ValueError("Proporção de corte resulta em lista vazia ou inválida.")

        trimmed_list = self.numbers[trim_count:-trim_count]

        trimmed_mean = sum(trimmed_list) / len(trimmed_list)

        return trimmed_mean
