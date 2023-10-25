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


    /**
     * Compara as quilometragens totais {@code double} 
     * dos veículos que compõem esta frota e fornece qual deles tem a maior quilometragem total {@code double}.
     *
     * @return  {@code Veiculo} Veiculo com maior quilometragem total.
     *
     */
    public Veiculo maiorKmTotal(){
        Veiculo maiorKm = new Veiculo();
        for(Veiculo veiculo : this.veiculos){
            if(maiorKm.kmTotal() < veiculo.kmTotal()){
                maiorKm = veiculo;
            }
           
        }
        return maiorKm;
    }


    /**
     * NÃO ENTENDI
     * Compara as quilometragens totais {@code double} 
     * dos veículos que compõem esta frota e fornece qual deles tem a maior quilometragem total {@code double}.
     *
     * @return  {@code Veiculo} Veiculo com maior quilometragem total.
     *
     */
    public Veiculo maiorKmMedia(){
        Veiculo x = new Veiculo();
        return x; // Peruntar antes de finalizar
    }


    /**
     * Fornece um relatório com os dados da frota {@code String} e
     * dos veículos que compõem esta frota.
     * 
     * <p> Dados da frota:
     * <ul>
     *   <li> Tamanho
     *   <li> Dados dos Veículos
     *     <ul>
     *       <li> Placa
     *       <li> Km Total   
     *     </ul>
     * </ul>
     *
     * @return  {@code String} relatório com os dados da frota.
     *
     */
    public String relatorioFrota(){
        StringBuilder relatorio = new StringBuilder();

        relatorio.append("=================\nRELATÓRIO\n=================\n");
        relatorio.append("TAMANHO DA FROTA: " + this.tamanhoFrota + "veículos\n");
        relatorio.append("=================\nDADOS DOS VEÍCULOS\n=================\n");

        for(Veiculo veiculo : this.veiculos){
            relatorio.append("PLACA: " + veiculo.getPlaca() + "\n");
            relatorio.append("KM TOTAL: " + veiculo.kmTotal() + "KM\n");
            relatorio.append("=================\n");
        }

        return relatorio.toString();
    }










    



}
