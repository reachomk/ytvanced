package defpackage;

import java.nio.ByteBuffer;
import java.util.HashMap;

/* renamed from: balt */
public abstract class balt extends bakn {
    private static HashMap d;
    private int a = 1;
    private int b;
    private int c;

    protected balt(String str) {
        super(str);
    }

    public abstract byte[] a();

    public abstract void c(ByteBuffer byteBuffer);

    public abstract int g();

    /* Access modifiers changed, original: protected|final */
    public final long b() {
        return (long) (g() + 16);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        byteBuffer.getInt();
        this.a = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        this.b = s;
        if (s < (short) 0) {
            this.b = s + 65536;
        }
        s = byteBuffer.getShort();
        this.c = s;
        if (s < (short) 0) {
            this.c = s + 65536;
        }
        i -= 16;
        ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.duplicate().slice().limit(i);
        byteBuffer.position(i + byteBuffer.position());
        c(byteBuffer2);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(ByteBuffer byteBuffer) {
        byteBuffer.putInt(g() + 16);
        byteBuffer.put("data".getBytes());
        byteBuffer.putInt(this.a);
        cin.b(byteBuffer, this.b);
        cin.b(byteBuffer, this.c);
        byteBuffer.put(a());
    }

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        hashMap.put("0", "English");
        d.put("1", "French");
        d.put("2", "German");
        d.put("3", "Italian");
        d.put("4", "Dutch");
        d.put("5", "Swedish");
        d.put("6", "Spanish");
        d.put("7", "Danish");
        d.put("8", "Portuguese");
        d.put("9", "Norwegian");
        d.put("10", "Hebrew");
        d.put("11", "Japanese");
        d.put("12", "Arabic");
        d.put("13", "Finnish");
        d.put("14", "Greek");
        d.put("15", "Icelandic");
        d.put("16", "Maltese");
        d.put("17", "Turkish");
        d.put("18", "Croatian");
        d.put("19", "Traditional_Chinese");
        d.put("20", "Urdu");
        d.put("21", "Hindi");
        d.put("22", "Thai");
        d.put("23", "Korean");
        d.put("24", "Lithuanian");
        d.put("25", "Polish");
        d.put("26", "Hungarian");
        d.put("27", "Estonian");
        d.put("28", "Lettish");
        d.put("29", "Sami");
        d.put("30", "Faroese");
        d.put("31", "Farsi");
        d.put("32", "Russian");
        d.put("33", "Simplified_Chinese");
        d.put("34", "Flemish");
        d.put("35", "Irish");
        d.put("36", "Albanian");
        d.put("37", "Romanian");
        d.put("38", "Czech");
        d.put("39", "Slovak");
        d.put("40", "Slovenian");
        d.put("41", "Yiddish");
        d.put("42", "Serbian");
        d.put("43", "Macedonian");
        d.put("44", "Bulgarian");
        d.put("45", "Ukrainian");
        d.put("46", "Belarusian");
        d.put("47", "Uzbek");
        d.put("48", "Kazakh");
        d.put("49", "Azerbaijani");
        d.put("50", "AzerbaijanAr");
        d.put("51", "Armenian");
        d.put("52", "Georgian");
        d.put("53", "Moldavian");
        d.put("54", "Kirghiz");
        d.put("55", "Tajiki");
        d.put("56", "Turkmen");
        d.put("57", "Mongolian");
        d.put("58", "MongolianCyr");
        d.put("59", "Pashto");
        d.put("60", "Kurdish");
        d.put("61", "Kashmiri");
        d.put("62", "Sindhi");
        d.put("63", "Tibetan");
        d.put("64", "Nepali");
        d.put("65", "Sanskrit");
        d.put("66", "Marathi");
        d.put("67", "Bengali");
        d.put("68", "Assamese");
        d.put("69", "Gujarati");
        d.put("70", "Punjabi");
        d.put("71", "Oriya");
        d.put("72", "Malayalam");
        d.put("73", "Kannada");
        d.put("74", "Tamil");
        d.put("75", "Telugu");
        d.put("76", "Sinhala");
        d.put("77", "Burmese");
        d.put("78", "Khmer");
        d.put("79", "Lao");
        d.put("80", "Vietnamese");
        d.put("81", "Indonesian");
        d.put("82", "Tagalog");
        d.put("83", "MalayRoman");
        d.put("84", "MalayArabic");
        d.put("85", "Amharic");
        String str = "87";
        d.put(str, "Galla");
        d.put(str, "Oromo");
        d.put("88", "Somali");
        d.put("89", "Swahili");
        d.put("90", "Kinyarwanda");
        d.put("91", "Rundi");
        d.put("92", "Nyanja");
        d.put("93", "Malagasy");
        d.put("94", "Esperanto");
        d.put("128", "Welsh");
        d.put("129", "Basque");
        d.put("130", "Catalan");
        d.put("131", "Latin");
        d.put("132", "Quechua");
        d.put("133", "Guarani");
        d.put("134", "Aymara");
        d.put("135", "Tatar");
        d.put("136", "Uighur");
        d.put("137", "Dzongkha");
        d.put("138", "JavaneseRom");
        d.put("32767", "Unspecified");
    }
}
