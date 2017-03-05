package org.vbm.coloreffect;

/**
 * Created by vbm on 28/02/2017.
 */

public class Description {
    static String  getEffect ( String  color )   {
        String  effect = "";
        if   ( color . equals ( "красный" ))   {
            effect  =  "Возбуждающий, согревающий, активный, энергичный, проникающий, тепловой, активизирует все функции организма; используется для лечения ветряной оспы, скарлатины, кори и некоторых кожных заболеваний; на короткое время увеличивает мускульное напряжение, повышает кровяное давление, ускоряет ритм дыхания" ;
        }   else
        if   ( color . equals ( "оранжевый" ))   {
            effect  =  "Тонизирующий; действует в том же направлении, что и красный, но слабее; ускоряет пульсацию крови, улучшает пищеварение" ;
        }   else
        if   ( color . equals ( "желтый" ))   {
            effect  =  "Тонизирующий, физиологически оптимальный, наименее утомляющий; стимулирует зрение и нервную деятельность" ;
        } else
        if   (color.equals("черный")) {
            effect = "As My Soul";
        } else
        if   ( color . equals ( "зеленый" ))   {
            effect  =  "Физиологически оптимальный; уменьшает кровяное давление и расширяет капилляры; успокаивает и облегчает невралгии и мигрени; на продолжительное время повышает двигательно-мускульную работоспособность" ;
        }   else
        if   ( color . equals ( "голубой" ))   {
            effect  =  "Успокаивающий; снижает мускульное напряжение и кровяное давление, успокаивает пульс и замедляет ритм дыхания" ;
        }   else
        if   ( color . equals ( "синий" ))   {
            effect  =  "Успокаивающее действие переходит в угнетающее; способствует затормаживанию функций физиологических систем человека" ;
        } else {
            effect = "Соединяет эффект красного и синего цветов; производит угнетающее действие на нервную систему";
        }
        return  effect ;
    }

    static int getColor( String color ){
        if( color.equals("красный")) return R.color.colorRed;
        if( color.equals("оранжевый")) return R.color.colorMagenta;
        if( color.equals("желтый")) return R.color.colorYellow;
        if( color.equals("зеленый")) return R.color.colorGreen;
        if( color.equals("голубой")) return R.color.colorLightBlue;
        if( color.equals("синий")) return R.color.colorBlue;
        if( color.equals("фиолетовый")) return R.color.colorViolet;
        if( color.equals("черный")) return R.color.colorBlack;
        return 0;
    }
}
