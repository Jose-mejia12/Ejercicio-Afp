package Clases;
public class Planilla {
    public int nIdentificacion;  
    public String NombreAfiliado;
    public double Salario;
    public double EstadoCuenta;
    public double AporteRealizado;
    public double AporteEmpleado;
    public double AportePatrono;
    public double AportesTotales;
    public double Cuentas;
    private CuentaAfiliado cuenta;
 

      // constructor de la clase.
      public Planilla(int Id, String NombreAfiliado, double Salario,double EstadoCuent, double AporteRealizar, 
                      double AporteEmpleado, double AportePatrono, double AportesTotales, double Cuentas) {
          this.nIdentificacion = Id;
          this.NombreAfiliado = NombreAfiliado;
          this.Salario = Salario;
          this.EstadoCuenta = EstadoCuent;
          this.AporteRealizado = AporteRealizar;
          this.AporteEmpleado = AporteEmpleado;
          this.AportePatrono = AportePatrono;
          this.AportesTotales = AportesTotales;
          this.Cuentas = Cuentas;
          this.cuenta = new CuentaAfiliado();
      
    }
     //Retornando los datos provinientes de CuentaAfiliado.
      public String verCuentaAfiliado(){
           return cuenta.newCuentaAfiliado(this);
      }
     
}
