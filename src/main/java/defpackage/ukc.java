package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: ukc */
public class ukc extends cih {
    public static final ukc a = new ukc();
    private static final Set b;
    private static final Set c;
    private static final Set d;

    public cis a(String str, byte[] bArr, String str2) {
        str2 = "moov";
        if (str2.equals(str)) {
            return new cjl();
        }
        String str3 = "mvhd";
        if (str3.equals(str)) {
            return new cjo();
        }
        if ("ftyp".equals(str)) {
            return new cje();
        }
        if ("mdat".equals(str)) {
            return new ckt();
        }
        if (str2.equals(str)) {
            return new cjl();
        }
        if (str3.equals(str)) {
            return new cjo();
        }
        if ("trak".equals(str)) {
            return new ckg();
        }
        if ("tkhd".equals(str)) {
            return new ckf();
        }
        if ("edts".equals(str)) {
            return new ciz();
        }
        if ("elst".equals(str)) {
            return new cjc();
        }
        if ("mdia".equals(str)) {
            return new cjh();
        }
        if ("mdhd".equals(str)) {
            return new cjk();
        }
        if ("vmhd".equals(str)) {
            return new ckj();
        }
        if ("smhd".equals(str)) {
            return new cjv();
        }
        if ("sthd".equals(str)) {
            return new ckc();
        }
        if ("hmhd".equals(str)) {
            return new cji();
        }
        if ("hdlr".equals(str)) {
            return new cjf();
        }
        if ("minf".equals(str)) {
            return new cjj();
        }
        if ("dinf".equals(str)) {
            return new cix();
        }
        if ("dref".equals(str)) {
            return new cja();
        }
        if ("url ".equals(str)) {
            return new ciy();
        }
        if ("stbl".equals(str)) {
            return new cju();
        }
        if ("ctts".equals(str)) {
            return new cit();
        }
        if ("stsd".equals(str)) {
            return new cjs();
        }
        if ("stts".equals(str)) {
            return new cke();
        }
        if ("stss".equals(str)) {
            return new ckb();
        }
        if ("stsc".equals(str)) {
            return new cjt();
        }
        if ("stsz".equals(str)) {
            return new cjr();
        }
        if ("stco".equals(str)) {
            return new cjy();
        }
        if ("co64".equals(str)) {
            return new cir();
        }
        if ("skip".equals(str)) {
            return new cjg();
        }
        if ("free".equals(str)) {
            return new cjd();
        }
        if ("sdtp".equals(str)) {
            return new cjq();
        }
        if (b.contains(str)) {
            return new cky(str);
        }
        if (c.contains(str)) {
            return new cle(str);
        }
        if (d.contains(str)) {
            return new ckz(str);
        }
        if ("stsd-stpp".equals(str)) {
            return new banr();
        }
        if ("stsd-mp4s".equals(str)) {
            return new cla(str);
        }
        if ("udta".equals(str)) {
            return new ckk();
        }
        if ("pasp".equals(str)) {
            return new balu();
        }
        if ("uuid".equals(str)) {
            return new ckh(bArr);
        }
        if ("st3d".equals(str)) {
            return new uky();
        }
        if ("sv3d".equals(str)) {
            return new ukv();
        }
        if ("©xyz".equals(str)) {
            return new ulg();
        }
        return new cki(str);
    }

    static {
        HashSet hashSet = new HashSet();
        b = hashSet;
        hashSet.add("samr");
        b.add("sawb");
        b.add("mp4a");
        b.add("drms");
        b.add("alac");
        b.add("owma");
        b.add("ac-3");
        b.add("ec-3");
        b.add("mlpa");
        b.add("dtsl");
        b.add("dtsh");
        b.add("dtse");
        b.add("lpcm");
        b.add("dtsc");
        b.add("enca");
        hashSet = new HashSet();
        c = hashSet;
        hashSet.add("mp4v");
        c.add("s263");
        c.add("avc1");
        c.add("avc3");
        c.add("drmi");
        c.add("hvc1");
        c.add("hev1");
        c.add("encv");
        hashSet = new HashSet();
        d = hashSet;
        hashSet.add("tx3g");
        d.add("enct");
    }
}
