# Imports
from matplotlib import pyplot as plt
import numpy as np

# Settings
plt.style.use('tableau-colorblind10')
path = '/Users/guttofranca/Repos/projetos-faculdade/terceiro-periodo/estatistica/Atividade02/'
# Plot
x = [i for i in range(-100, 100)]
y = [(i**2 + 2*i +1)*np.sin(i) for i in x]
plt.plot(x, y, linewidth=2);
plt.grid(False);
plt.title('Gráfico de x^2 + 2x + 1 * sin(x)', fontsize=12);
plt.xlabel('x', fontsize=10);
plt.ylabel('f(x)', fontsize=10);

# Save and show
plt.savefig(path + 'desafio2.png');
plt.show()