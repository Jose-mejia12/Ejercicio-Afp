
package Clases;

/**
 *
 * @author HP
 */
public class CuentaAfiliado {
    public String newCuentaAfiliado(Planilla planilla){ 
        return
           "N° del Afiliado:"+planilla.nIdentificacion+"\nNombre del Empleado Afiliado:"
           +planilla.NombreAfiliado+"\nEstado de Cuenta. $"+planilla.EstadoCuenta+
           "\nSalario del Afiliado: $"+planilla.Salario
           +"\nAporte del Empleado: $"+planilla.AporteEmpleado+
           "\nAporte del Patrono.: $"+planilla.AportePatrono
           +"\nTotal de Aportes: $"+planilla.AportesTotales
           +"\nCantidad de aporte a cuenta del afiliado: $"+planilla.AporteRealizado
           +"\nEstado de cuenta actualizada: $"+planilla.Cuentas;
    }
 
}
    

