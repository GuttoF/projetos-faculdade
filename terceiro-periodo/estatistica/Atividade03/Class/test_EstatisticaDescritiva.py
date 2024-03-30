import unittest

from EstatisticaDescritiva import EstatisticaDescritiva


class TestEstatisticaDescritiva(unittest.TestCase):
    def setUp(self):
        self.numbers = [5, 4, 3, 2, 1]
        self.stats = EstatisticaDescritiva(self.numbers)

    def test_order_list(self):
        ordered_list = self.stats.order_list()
        self.assertEqual(ordered_list, [1, 2, 3, 4, 5])

    def test_mean(self):
        mean = self.stats.mean()
        self.assertEqual(mean, 3)

    def test_median(self):
        median = self.stats.median()
        self.assertEqual(median, 3)

    def test_mode(self):
        mode = self.stats.mode()
        self.assertEqual(mode, [1, 2, 3, 4, 5])

    def test_variance(self):
        variance = self.stats.variance()
        self.assertEqual(variance, 2)

    def test_std(self):
        std = self.stats.std()
        self.assertEqual(std, 1.4142135623730951)

    def test_symmetry(self):
        symmetry = self.stats.symmetry()
        self.assertEqual(symmetry, "A distribuição pode não ser claramente simétrica ou assimétrica.")


if __name__ == "__main__":
    unittest.main()
