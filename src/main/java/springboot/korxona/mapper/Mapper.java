package springboot.korxona.mapper;

import springboot.korxona.entity.statistika.XodimlarMaoshiUmumiySummaOylik;
import springboot.korxona.dto.*;
import springboot.korxona.dto.staistika.XodimlarMaoshiUmumiySummaOylikDto;
import springboot.korxona.dto.staistika.XodimlarSoniStatistikaDto;
import springboot.korxona.entity.Bolim;
import springboot.korxona.entity.Mijoz;
import springboot.korxona.entity.Reklama;
import springboot.korxona.entity.Xodim;
import springboot.korxona.entity.statistika.XodimlarSoniStatistika;

public class Mapper {
    public static Xodim mapToXodim(XodimDto xodimDto){
        Xodim xodim=new Xodim();
        xodim.setIsmi(xodimDto.getIsmi());
        xodim.setFamiliyasi(xodimDto.getFamiliyasi());
        xodim.setSharifi(xodimDto.getSharifi());
        xodim.setIsh_xaqqi(xodimDto.getIsh_xaqqi());
        xodim.setJshshir(xodimDto.getJshshir());
        xodim.setPassport_raqam(xodimDto.getPassport_raqam());
        xodim.setMillati(xodimDto.getMillati());
        xodim.setYashash_manzili(xodimDto.getYashash_manzili());
        xodim.setPassport_seriyasi(xodimDto.getPassport_seriyasi());
        xodim.setYoshi(xodimDto.getYoshi());
        xodim.setBolim(xodim.getBolim());
        return xodim;
    }
    public static XodimDto mapToXodimDto(Xodim xodimDto){
        XodimDto xodim=new XodimDto();
        xodim.setIsmi(xodimDto.getIsmi());
        xodim.setFamiliyasi(xodimDto.getFamiliyasi());
        xodim.setSharifi(xodimDto.getSharifi());
        xodim.setIsh_xaqqi(xodimDto.getIsh_xaqqi());
        xodim.setJshshir(xodimDto.getJshshir());
        xodim.setPassport_raqam(xodimDto.getPassport_raqam());
        xodim.setMillati(xodimDto.getMillati());
        xodim.setYashash_manzili(xodimDto.getYashash_manzili());
        xodim.setPassport_seriyasi(xodimDto.getPassport_seriyasi());
        xodim.setYoshi(xodimDto.getYoshi());
        xodim.setBolim(xodim.getBolim());
        return xodim;
    }
    public static Bolim mapToBolim(BolimDto bolimDto){
        Bolim bolim=new Bolim();
        bolim.setName(bolimDto.getName());
        return bolim;
    }
    public static Mijoz mapToMijoz(MijozDto mijozDto){
        Mijoz mijoz=new Mijoz();
        mijoz.setIsmi(mijozDto.getIsmi());
        mijoz.setFamiliyasi(mijozDto.getFamiliyasi());
        mijoz.setSharifi(mijozDto.getSharifi());
        mijoz.setPassport_seriyasi(mijozDto.getPassport_seriyasi());
        mijoz.setPassport_raqam(mijozDto.getPassport_raqam());
        mijoz.setJshshir(mijozDto.getJshshir());
        mijoz.setMillati(mijozDto.getMillati());
        mijoz.setYashash_manzili(mijozDto.getYashash_manzili());
        mijoz.setYoshi(mijozDto.getYoshi());
        mijoz.setXodim(mijozDto.getXodim());
        mijoz.setDate(mijozDto.getDate());
        return mijoz;
    }
    public static MijozDto mapToMijozDto(Mijoz mijozDto){
        MijozDto mijoz=new MijozDto();
        mijoz.setIsmi(mijozDto.getIsmi());
        mijoz.setFamiliyasi(mijozDto.getFamiliyasi());
        mijoz.setSharifi(mijozDto.getSharifi());
        mijoz.setPassport_seriyasi(mijozDto.getPassport_seriyasi());
        mijoz.setPassport_raqam(mijozDto.getPassport_raqam());
        mijoz.setJshshir(mijozDto.getJshshir());
        mijoz.setMillati(mijozDto.getMillati());
        mijoz.setYashash_manzili(mijozDto.getYashash_manzili());
        mijoz.setYoshi(mijozDto.getYoshi());
        mijoz.setXodim(mijozDto.getXodim());
        mijoz.setDate(mijozDto.getDate());
        return mijoz;
    }

    public static Reklama MapToReklama(ReklamaDto reklamaDto){
        Reklama reklama=new Reklama();
        reklama.setReklama_turi(reklamaDto.getReklama_turi());
        reklama.setXarajati(reklamaDto.getXarajati());
        reklama.setReklama_kuni(reklamaDto.getReklama_kuni());
        reklama.setXodim(reklamaDto.getXodim());
        return reklama;
    }
    public static XodimlarSoniStatistikaDto mapToXodimlarSoniStatistikaDto(XodimlarSoniStatistika xodim){
        XodimlarSoniStatistikaDto xodimlarSoniStatistikaDto=new XodimlarSoniStatistikaDto();
        xodimlarSoniStatistikaDto.setXodim(xodim.getXodimIsmi());
        xodimlarSoniStatistikaDto.setBolim(xodim.getBolim());
        return xodimlarSoniStatistikaDto;
    }
    public static XodimlarMaoshiUmumiySummaOylikDto mapToOylik(XodimlarMaoshiUmumiySummaOylik xodimlarMaoshiUmumiySummaOylik){
        XodimlarMaoshiUmumiySummaOylikDto xodimlarMaoshiUmumiySummaOylikDto= new XodimlarMaoshiUmumiySummaOylikDto();
        xodimlarMaoshiUmumiySummaOylikDto.setSumma(xodimlarMaoshiUmumiySummaOylik.getSumma());
        return xodimlarMaoshiUmumiySummaOylikDto;
    }

}
