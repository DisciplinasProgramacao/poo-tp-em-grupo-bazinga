public class Frota {
    private int tamanhoFrota;
    private Veiculo [] veiculos;

    public Frota(Veiculo [] veiculos){
        this.tamanhoFrota = veiculos.length;
        this.veiculos = veiculos;
    }

    /**
     * Compara a placa {@code String} passada como argumento com as placas 
     * {@code String} dos veículos que compõem esta rota.
     * 
     *
     * <p> A placa é considerada igual ao do veículo da frota quando:
     * <ul>
     *   <li> Todos os caracteres em lowcase são iguais
     * </ul>
     *
     * @param  placa
     *         {@code String} a ser procurada 
     *
     * @return  {@code Veiculo} se o argumento placa for encontrado nos veículos
     *          da frota; {@code
     *          null} se não for encontrado
     *
     */
    public Veiculo localizarVeiculo (String placa){
        Veiculo veiculoBuscado = null;
        for(Veiculo veiculo : this.veiculos){
            if(veiculo.getPlaca().equalsIgnoreCase(placa)){
                veiculoBuscado = veiculo;
            }
        
        }
        return veiculoBuscado;
        
    }

    
    /**
     * Realiza da soma de todas as quilometragens totais {@code double} 
     * dos veículos que compõem esta frota e fornece sua quilometragem total {@code double}.
     *
     * @return  {@code double} valor da quilometragem total desta frota.
     *
     */
    public double quilometragemTotal(){
        double kmTotalFrota = 0.0;
        for(Veiculo veiculo : this.veiculos){
           kmTotalFrota += veiculo.kmTotal();
        }

        return kmTotalFrota;
    }

    



}
