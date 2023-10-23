package com.logusinfo.infodividas;

/**
 *
 */
public class Contrato {
  private String identificacao;
  private String status;
  private String credor;
  private String tipoOperacao;
  private String prf;
  private String valor;
  private String finalidade;
  private String lei;
  private String atualizacao;
  private String txFixa;
  private String spread;
  private String txEfetiva;
  private String prazoFinal;
  private String periodicidade;
  private String sistemaAmortizacao;
  private String quantidadeParcelasAmort;
  private String garantias;
  private String garantidoPelaUniao;

  /**
   * @return {@link #identificacao}
   */
  public String getIdentificacao() {
    return identificacao;
  }

  /**
   * @param identificacao atualiza {@link #identificacao}.
   */
  public void setIdentificacao(String identificacao) {
    this.identificacao = identificacao;
  }

  /**
   * @return {@link #status}
   */
  public String getStatus() {
    return status;
  }

  /**
   * @param status atualiza {@link #status}.
   */
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * @return {@link #credor}
   */
  public String getCredor() {
    return credor;
  }

  /**
   * @param credor atualiza {@link #credor}.
   */
  public void setCredor(String credor) {
    this.credor = credor;
  }

  /**
   * @return {@link #prf}
   */
  public String getPrf() {
    return prf;
  }

  /**
   * @param prf atualiza {@link #prf}.
   */
  public void setPrf(String prf) {
    this.prf = prf;
  }

  /**
   * @return {@link #valor}
   */
  public String getValor() {
    return valor;
  }

  /**
   * @param valor atualiza {@link #valor}.
   */
  public void setValor(String valor) {
    this.valor = valor;
  }

  /**
   * @return {@link #finalidade}
   */
  public String getFinalidade() {
    return finalidade;
  }

  /**
   * @param finalidade atualiza {@link #finalidade}.
   */
  public void setFinalidade(String finalidade) {
    this.finalidade = finalidade;
  }

  /**
   * @return {@link #lei}
   */
  public String getLei() {
    return lei;
  }

  /**
   * @param lei atualiza {@link #lei}.
   */
  public void setLei(String lei) {
    this.lei = lei;
  }

  /**
   * @return {@link #atualizacao}
   */
  public String getAtualizacao() {
    return atualizacao;
  }

  /**
   * @param atualizacao atualiza {@link #atualizacao}.
   */
  public void setAtualizacao(String atualizacao) {
    this.atualizacao = atualizacao;
  }

  /**
   * @return {@link #txFixa}
   */
  public String getTxFixa() {
    return txFixa;
  }

  /**
   * @param txFixa atualiza {@link #txFixa}.
   */
  public void setTxFixa(String txFixa) {
    this.txFixa = txFixa;
  }

  /**
   * @return {@link #spread}
   */
  public String getSpread() {
    return spread;
  }

  /**
   * @param spread atualiza {@link #spread}.
   */
  public void setSpread(String spread) {
    this.spread = spread;
  }

  /**
   * @return {@link #txEfetiva}
   */
  public String getTxEfetiva() {
    return txEfetiva;
  }

  /**
   * @param txEfetiva atualiza {@link #txEfetiva}.
   */
  public void setTxEfetiva(String txEfetiva) {
    this.txEfetiva = txEfetiva;
  }

  /**
   * @return {@link #prazoFinal}
   */
  public String getPrazoFinal() {
    return prazoFinal;
  }

  /**
   * @param prazoFinal atualiza {@link #prazoFinal}.
   */
  public void setPrazoFinal(String prazoFinal) {
    this.prazoFinal = prazoFinal;
  }

  /**
   * @return {@link #periodicidade}
   */
  public String getPeriodicidade() {
    return periodicidade;
  }

  /**
   * @param periodicidade atualiza {@link #periodicidade}.
   */
  public void setPeriodicidade(String periodicidade) {
    this.periodicidade = periodicidade;
  }

  /**
   * @return {@link #sistemaAmortizacao}
   */
  public String getSistemaAmortizacao() {
    return sistemaAmortizacao;
  }

  /**
   * @param sistemaAmortizacao atualiza {@link #sistemaAmortizacao}.
   */
  public void setSistemaAmortizacao(String sistemaAmortizacao) {
    this.sistemaAmortizacao = sistemaAmortizacao;
  }

  /**
   * @return {@link #quantidadeParcelasAmort}
   */
  public String getQuantidadeParcelasAmort() {
    return quantidadeParcelasAmort;
  }

  /**
   * @param quantidadeParcelasAmort atualiza {@link #quantidadeParcelasAmort}.
   */
  public void setQuantidadeParcelasAmort(String quantidadeParcelasAmort) {
    this.quantidadeParcelasAmort = quantidadeParcelasAmort;
  }

  /**
   * @return {@link #garantias}
   */
  public String getGarantias() {
    return garantias;
  }

  /**
   * @param garantias atualiza {@link #garantias}.
   */
  public void setGarantias(String garantias) {
    this.garantias = garantias;
  }

  /**
   * @return {@link #garantidoPelaUniao}
   */
  public String getGarantidoPelaUniao() {
    return garantidoPelaUniao;
  }

  /**
   * @param garantidoPelaUniao atualiza {@link #garantidoPelaUniao}.
   */
  public void setGarantidoPelaUniao(String garantidoPelaUniao) {
    this.garantidoPelaUniao = garantidoPelaUniao;
  }

  /**
   * @return {@link #tipoOperacao}
   */
  public String getTipoOperacao() {
    return tipoOperacao;
  }

  /**
   * @param tipoOperacao atualiza {@link #tipoOperacao}.
   */
  public void setTipoOperacao(String tipoOperacao) {
    this.tipoOperacao = tipoOperacao;
  }

  /**
   * @param i
   * @param texto
   */
  public void set(int i, String texto) {
    switch (i) {
    case 0:
      this.identificacao = texto;
      break;
    case 1:
      this.status = texto;
      break;
    case 2:
      this.credor = texto;
      break;
    case 3:
      this.tipoOperacao = texto;
      break;
    case 4:
      this.prf = texto;
      break;
    case 5:
      this.valor = texto;
      break;
    case 6:
      this.finalidade = texto;
      break;
    case 7:
      this.lei = texto;
      break;
    case 8:
      this.atualizacao = texto;
      break;
    case 9:
      this.txFixa = texto;
      break;
    case 10:
      this.spread = texto;
      break;
    case 11:
      this.txEfetiva = texto;
      break;
    case 12:
      this.prazoFinal = texto;
      break;
    case 13:
      this.periodicidade = texto;
      break;
    case 14:
      this.sistemaAmortizacao = texto;
      break;
    case 15:
      this.quantidadeParcelasAmort = texto;
      break;
    case 16:
      this.garantias = texto;
      break;
    case 17:
      this.garantidoPelaUniao = texto;
      break;
    default:
      break;
    }
  }

  @Override
  public String toString() {
    return "UNION SELECT '" + this.identificacao + "', '" + this.status
        + "', '" + this.credor + "', '" + this.tipoOperacao + "', '"
        + this.prf + "', '" + this.valor + "', '" + this.finalidade + "', '"
        + this.lei + "', '" + this.atualizacao + "', '" + this.txFixa
        + "', '" + this.spread + "', '" + this.txEfetiva + "', '"
        + this.prazoFinal + "', '" + this.periodicidade + "', '"
        + this.sistemaAmortizacao + "', '" + this.quantidadeParcelasAmort
        + "', '" + this.garantias + "', '" + this.garantidoPelaUniao
        + "' FROM DUAL";
  }

}
