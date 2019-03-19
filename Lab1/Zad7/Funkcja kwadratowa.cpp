#include "pch.h"
#include <iostream>
#include <stdlib.h>
using namespace std;

int main()
{
	double a, b, c, x;
	setlocale(LC_ALL, "Polish");
	while(true)
	{ 
	cout << "Program rozwiązuje równanie kwadratowe, podaj współczynnik a" << endl;
	cin >> a;
	cout << "Podaj współczynnik b" << endl;
	cin >> b;
	cout << "Podaj współczynnik c" << endl;
	cin >> c;
	if (a == 0 && b == 0 && c == 0)
	{
		cout << "Równanie ma nieskończoną liczbę rozwiązań." << endl;
	}
	if (a == 0 && b != 0)
	{
		cout << "Jest to równanie liniowe." << endl;
		x = -c / b;
		cout << "Rozwiązaniem równania liniowego jest " << x << endl;
	}
	else if (a != 0)
	{
		cout << "Równanie jest kwadratowe" << endl;
		double deltaf;
		double x1, x2;
		deltaf = (b*b) - (4 * a*c);
		cout << "Delta wynosi: " << deltaf << endl;
		if (deltaf > 0)
		{
			x1 = (-b - sqrt(deltaf)) / (2 * a);
			x2 = (-b + sqrt(deltaf)) / (2 * a);
			cout << "Rozwiązania rzeczywiste: " << endl;
			cout << "Rozwiązania równania, x1 = " << x1 << "; x2 = " << x2 << endl;
		}
		if (deltaf == 0)
		{
			double x0;
			x0 = -b / (2 * a);
			cout << "Rozwiązaniem równania kwadratowego jest: " << x0 << endl;
		}
		if (deltaf < 0)
		{
			double i;
			x = (-b / (2 * a));
			i = sqrt(-deltaf);
			cout << "Rozwiązania zespolone: " << x << " + " << i << " *i" << endl;
			cout << x << " - " << i << " *i" << endl;
		}
	}
	}
	getchar();
	return 0;
}
