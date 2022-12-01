package sptech.school.guardian.angel.project;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;
import com.github.britooo.looca.api.group.discos.DiscoGrupo;
import com.github.britooo.looca.api.group.discos.Volume;
import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.group.processador.Processador;
import com.github.britooo.looca.api.group.processos.Processo;
import com.github.britooo.looca.api.group.processos.ProcessoGrupo;
import com.github.britooo.looca.api.util.Conversor;
import java.io.IOException;
import java.util.List;
import org.json.JSONObject;

public class InformacoesLooca {

    Looca looca = new Looca();
    Processador processador = new Looca().getProcessador();
    Memoria memoriaRam = looca.getMemoria();
    Conversor conversor = new Conversor();
    ProcessoGrupo processoGrupo = looca.getGrupoDeProcessos();
    List<Processo> processos = processoGrupo.getProcessos();
    DiscoGrupo discoGrupo = looca.getGrupoDeDiscos();
    List<Disco> discos = discoGrupo.getDiscos();
    List<Volume> volumes = discoGrupo.getVolumes();
    JSONObject json = new JSONObject();
    Pipefy pipe = new Pipefy();
    Funcionario func = new Funcionario();

    public void timer(Integer tempo) {
        try {
            Thread.sleep(tempo);
        } catch (Exception e) {
        }
    }

    public void exibirProcessos() {
        while (true) {
            for (Processo processo : looca.getGrupoDeProcessos().getProcessos()) {
                if (processo.getUsoCpu() >= 0.5) {

                    System.out.println("Nome: " + processo.getNome() + "\n" + processo + "\n");
                }
            }
        }
    }
    
        public long exibirSwap(){
        long porcentagem = 0;
        if(looca.getSistema().getSistemaOperacional().equalsIgnoreCase("windows")){
            WindowsGlobalMemory windowsG = new WindowsGlobalMemory();
            WindowsVirtualMemory windowsSwap = new WindowsVirtualMemory(windowsG);
            porcentagem = (windowsSwap.getSwapUsed() * 100) / (windowsSwap.getSwapTotal());
        } else if(looca.getSistema().getSistemaOperacional().equalsIgnoreCase("Ubuntu")){
            LinuxGlobalMemory linuxG = new LinuxGlobalMemory();
            LinuxVirtualMemory linuxSwap = new LinuxVirtualMemory(linuxG);
            porcentagem = (linuxSwap.getSwapUsed() * 100) / (linuxSwap.getSwapTotal());
        }
        return porcentagem;
    }

    public void exibirMemoria() {
        while (true) {
            System.out.println(memoriaRam);
        }
    }

    public String validacaoCPU() throws IOException, InterruptedException {
        Double cpu = looca.getProcessador().getUso();
        if (cpu <= 40) {
            return "Bom";
        } else if (cpu > 40 && cpu < 70) {
            return "Ok";
        } else {
            pipe.criarCards("CPU", 70, func.getNome());
            return "Crítico";
        }
    }

    public String validacaoVolume() throws IOException, InterruptedException {
        for (Volume volume : volumes) {

            Long porcentagemVolume = (volume.getDisponivel() * 100) / volume.getTotal();
            if (porcentagemVolume <= 40) {
                return "Cheio";
            } else if (porcentagemVolume > 40 && porcentagemVolume < 70) {
                return "Medio";
            } else {
                return "Limpo";
            }
        }
        return null;
    }

    public Double porcentagemRam() {

        Double ramDisponivel = (memoriaRam.getDisponivel().doubleValue() * 100) / memoriaRam.getTotal();
        return ramDisponivel;
    }

    public String validacaoRam() throws IOException, InterruptedException {
        long ramDisponivel = (memoriaRam.getDisponivel()) / memoriaRam.getTotal();
        if (ramDisponivel <= 40) {
            return "Bom";
        } else if (ramDisponivel > 40 && ramDisponivel < 70) {
            return "Ok";
        } else {
            pipe.criarCards("Ram", 70, func.getNome());
            return "Critico";
        }
    }

    public Long exibirMemoriaDisco() {
        //EM BYTES converção 10 elevado a 9
        for (Volume volume : volumes) {
            Long porcentagemVolume = (volume.getDisponivel() * 100) / volume.getTotal();
            String volumeTotal = Conversor.formatarBytes(volume.getTotal());
            String volumeDisponivel = Conversor.formatarBytes(volume.getDisponivel());

            return porcentagemVolume;
        }
        return null;
    }
}

//        timer.scheduleAtFixedRate(new TimerTask() {
//            public void run() {     
//                System.out.println(memoria);
//                System.out.println("Memoria CPU: " + processador.getUso() + "\n");
//                }
//        },delay, interval);
//        looca.getGrupoDeProcessos().getProcessos()
//                .forEach(processo -> {
//                    if (processo.getNome().contains("chrome")) {
//                        System.out.println(processo.getNome() + ", " + processo.getMemoriaVirtualUtilizada());
//                    }
//                });
