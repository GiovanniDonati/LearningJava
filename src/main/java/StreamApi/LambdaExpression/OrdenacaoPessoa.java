//package main.java.StreamApi.LambdaExpression;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class OrdenacaoPessoa {
//    private List<OrdenacaoPessoa> pessoaList;
//
//    public void ordenacaoPessoa(){
//        this.pessoaList = new ArrayList<>();
//    }
//
//    public List<OrdenacaoPessoa> ordenacaoPorAltura(){
//        if(!pessoaList.isEmpty()){
//            List<OrdenacaoPessoa>pessoasPorAltura = new ArrayList<>(pessoaList);
//            pessoasPorAltura.sort((p1,p2) -> Double.compare(p1.getAltura(), p2.getAltura()));
//            return pessoasPorAltura;
//        } else {
//            throw new RuntimeException("A lista está vazia!");
//        }
//    }
//}
