using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace w05p03
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
            SolidColorBrush b1 = new SolidColorBrush(Colors.IndianRed);
            LinearGradientBrush b2 = new LinearGradientBrush();
            b2.GradientStops.Add(new GradientStop(Colors.Indigo, 0));
            b2.GradientStops.Add(new GradientStop(Colors.Blue, 0.5));
            b2.GradientStops.Add(new GradientStop(Colors.GreenYellow, 1));
           

            elipsa1.Fill = b2;
            elipsa2.Fill = b1;
        }
    }
}
