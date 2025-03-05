package com.cultodeportivo.models.negocio;

import java.time.LocalDate;

import com.cultodeportivo.models.personal.Empleado;

public class CuadreCaja {
    
    private Empleado empleado;

    private double efectivoInicial;
    private double efectivoFinal;

    private double ventasEfectivo;  
    private double ventasTarjeta;
    private double ventasTransferencia;
    private double ventasCheque;
    private double ventasCredito;
    private double ventasDebito;
    private double ventasMixto;
    private double ventasTotal;

    private double gastos;
    private double pagos;
    private double retiros;
    private double depositos;
    private double devoluciones;

    private double billetes100;
    private double billetes50;
    private double billetes20;
    private double billetes10;
    private double billetes5;
    private double billetes1;
    private double monedas1;
    private double monedas50;
    private double monedas25;
    private double monedas10;
    private double monedas5;
    private double monedas1centavo;
    private double total;

    private LocalDate fecha;

    public CuadreCaja() {
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public double getEfectivoInicial() {
        return efectivoInicial;
    }

    public void setEfectivoInicial(double efectivoInicial) {
        this.efectivoInicial = efectivoInicial;
    }

    public double getEfectivoFinal() {
        return efectivoFinal;
    }

    public void setEfectivoFinal(double efectivoFinal) {
        this.efectivoFinal = efectivoFinal;
    }

    public double getVentasEfectivo() {
        return ventasEfectivo;
    }

    public void setVentasEfectivo(double ventasEfectivo) {
        this.ventasEfectivo = ventasEfectivo;
    }

    public double getVentasTarjeta() {
        return ventasTarjeta;
    }

    public void setVentasTarjeta(double ventasTarjeta) {
        this.ventasTarjeta = ventasTarjeta;
    }

    public double getVentasTransferencia() {
        return ventasTransferencia;
    }

    public void setVentasTransferencia(double ventasTransferencia) {
        this.ventasTransferencia = ventasTransferencia;
    }

    public double getVentasCheque() {
        return ventasCheque;
    }

    public void setVentasCheque(double ventasCheque) {
        this.ventasCheque = ventasCheque;
    }

    public double getVentasCredito() {
        return ventasCredito;
    }

    public void setVentasCredito(double ventasCredito) {
        this.ventasCredito = ventasCredito;
    }

    public double getVentasDebito() {
        return ventasDebito;
    }

    public void setVentasDebito(double ventasDebito) {
        this.ventasDebito = ventasDebito;
    }

    public double getVentasMixto() {
        return ventasMixto;
    }

    public void setVentasMixto(double ventasMixto) {
        this.ventasMixto = ventasMixto;
    }

    public double getVentasTotal() {
        return ventasTotal;
    }

    public void setVentasTotal(double ventasTotal) {
        this.ventasTotal = ventasTotal;
    }

    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }

    public double getPagos() {
        return pagos;
    }

    public void setPagos(double pagos) {
        this.pagos = pagos;
    }

    public double getRetiros() {
        return retiros;
    }

    public void setRetiros(double retiros) {
        this.retiros = retiros;
    }

    public double getDepositos() {
        return depositos;
    }

    public void setDepositos(double depositos) {
        this.depositos = depositos;
    }

    public double getDevoluciones() {
        return devoluciones;
    }

    public void setDevoluciones(double devoluciones) {
        this.devoluciones = devoluciones;
    }

    public double getBilletes100() {
        return billetes100;
    }

    public void setBilletes100(double billetes100) {
        this.billetes100 = billetes100;
    }

    public double getBilletes50() {
        return billetes50;
    }

    public void setBilletes50(double billetes50) {
        this.billetes50 = billetes50;
    }

    public double getBilletes20() {
        return billetes20;
    }

    public void setBilletes20(double billetes20) {
        this.billetes20 = billetes20;
    }

    public double getBilletes10() {
        return billetes10;
    }

    public void setBilletes10(double billetes10) {
        this.billetes10 = billetes10;
    }

    public double getBilletes5() {
        return billetes5;
    }

    public void setBilletes5(double billetes5) {
        this.billetes5 = billetes5;
    }

    public double getBilletes1() {
        return billetes1;
    }

    public void setBilletes1(double billetes1) {
        this.billetes1 = billetes1;
    }

    public double getMonedas1() {
        return monedas1;
    }

    public void setMonedas1(double monedas1) {
        this.monedas1 = monedas1;
    }

    public double getMonedas50() {
        return monedas50;
    }

    public void setMonedas50(double monedas50) {
        this.monedas50 = monedas50;
    }

    public double getMonedas25() {
        return monedas25;
    }

    public void setMonedas25(double monedas25) {
        this.monedas25 = monedas25;
    }

    public double getMonedas10() {
        return monedas10;
    }

    public void setMonedas10(double monedas10) {
        this.monedas10 = monedas10;
    }

    public double getMonedas5() {
        return monedas5;
    }

    public void setMonedas5(double monedas5) {
        this.monedas5 = monedas5;
    }

    public double getMonedas1centavo() {
        return monedas1centavo;
    }

    public void setMonedas1centavo(double monedas1centavo) {
        this.monedas1centavo = monedas1centavo;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    


}
