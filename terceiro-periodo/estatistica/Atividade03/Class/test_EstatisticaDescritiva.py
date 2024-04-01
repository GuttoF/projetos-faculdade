import unittest
from EstatisticaDescritiva import EstatisticaDescritiva

class TestEstatisticaDescritiva(unittest.TestCase):

    def setUp(self):
        self.numbers = [10, 11, 12, 20, 21, 22, 55, 44, 33, 22]
        self.stats = EstatisticaDescritiva(self.numbers)

    def test_order_list(self):
        expected_result = [10, 11, 12, 20, 21, 22, 22, 33, 44, 55]
        self.assertEqual(self.stats.order_list(), expected_result)

    def test_semi_range(self):
        expected_result = 22.5
        self.assertEqual(self.stats.semi_range(), expected_result)

    def test_geometric_mean(self):
        expected_result = 21.533
        self.assertAlmostEqual(self.stats.geometric_mean(), expected_result, places=3)

    def test_mean(self):
        expected_result = 25.0
        self.assertEqual(self.stats.mean(), expected_result)

    def test_median(self):
        expected_result = 21.5
        self.assertEqual(self.stats.median(), expected_result)

    def test_mode(self):
        expected_result = [22]
        self.assertEqual(self.stats.mode(), expected_result)

    def test_variance(self):
        expected_result = 197.4
        self.assertAlmostEqual(self.stats.variance(), expected_result, places=3)

    def test_std(self):
        expected_result = 14.05
        self.assertAlmostEqual(self.stats.std(), expected_result, places=3)

    def test_symmetry(self):
        expected_result = "A distribuição pode não ser claramente simétrica ou assimétrica."
        self.assertEqual(self.stats.symmetry(), expected_result)

    def test_skewness(self):
        expected_result = 1.293
        self.assertAlmostEqual(self.stats.skewness(), expected_result, places=3)

    def test_trimmed_mean(self):
        expected_result = 23.125
        self.assertEqual(self.stats.trimmed_mean(), expected_result)

if __name__ == '__main__':
    unittest.main()