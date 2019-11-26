package defpackage;

/* renamed from: ajtj */
public final class ajtj {
    public static ajtf a(Object obj) {
        String str;
        byte[] bArr = aock.c;
        Object obj2 = ajti.UNKNOWN;
        if (obj instanceof avkc) {
            avkc avkc = (avkc) obj;
            str = avkc.b;
            if ((avkc.a & 4) != 0) {
                bArr = avkc.c.d();
            }
            obj2 = ajti.NEXT;
        } else if (obj instanceof avkg) {
            avkg avkg = (avkg) obj;
            str = avkg.b;
            if ((avkg.a & 2) != 0) {
                bArr = avkg.c.d();
            }
            obj2 = ajti.NEXT_RADIO;
        } else if (obj instanceof awnh) {
            awnh awnh = (awnh) obj;
            str = awnh.b;
            if ((awnh.a & 2) != 0) {
                bArr = awnh.c.d();
            }
            obj2 = ajti.PREVIOUS;
        } else if (obj instanceof awzv) {
            awzv awzv = (awzv) obj;
            str = awzv.b;
            if ((awzv.a & 16) != 0) {
                bArr = awzv.c.d();
            }
            obj2 = ajti.RELOAD;
        } else if (obj instanceof ayhc) {
            ayhc ayhc = (ayhc) obj;
            str = ayhc.c;
            if ((ayhc.a & 4) != 0) {
                bArr = ayhc.d.d();
            }
            obj2 = ajti.TIMED;
        } else if (obj instanceof aofl) {
            aofl aofl = (aofl) obj;
            str = aofl.c;
            if ((aofl.a & 4) != 0) {
                bArr = aofl.b.d();
            }
            obj2 = ajti.ADDITIONAL_ACCOUNT;
        } else if (obj instanceof atuj) {
            atuj atuj = (atuj) obj;
            str = atuj.d;
            if ((atuj.a & 64) != 0) {
                bArr = atuj.e.d();
            }
            obj2 = ajti.INVALIDATION;
        } else {
            String str2;
            if (obj instanceof avta) {
                avta avta = (avta) obj;
                str2 = avta.b;
                if ((avta.a & 2) != 0) {
                    bArr = avta.c.d();
                }
            } else if (obj instanceof awgm) {
                awgm awgm = (awgm) obj;
                str2 = awgm.b;
                if ((awgm.a & 2) != 0) {
                    bArr = awgm.c.d();
                }
            } else if (!(obj instanceof auga)) {
                return null;
            } else {
                auga auga = (auga) obj;
                str2 = auga.c;
                if ((auga.a & 4) != 0) {
                    bArr = auga.d.d();
                }
            }
            str = str2;
        }
        ajtl ajtl = new ajtl();
        ajtl.d = amqw.a(obj);
        ajtl.b = bArr;
        ajtl.c = (ajti) amqw.a(obj2);
        ajtl.a = str;
        String str3 = "";
        if (ajtl.c == null) {
            str3 = str3.concat(" type");
        }
        if (ajtl.d == null) {
            str3 = String.valueOf(str3).concat(" continuation");
        }
        if (str3.isEmpty()) {
            return new ajtm(ajtl.a, ajtl.b, ajtl.c, ajtl.d);
        }
        String str4 = "Missing required properties:";
        throw new IllegalStateException(str3.length() == 0 ? new String(str4) : str4.concat(str3));
    }

    public static Object a(ajtf ajtf, Class cls) {
        if (ajtf instanceof ajtm) {
            ajtm ajtm = (ajtm) ajtf;
            if (cls.isAssignableFrom(ajtm.a.getClass())) {
                return ajtm.a;
            }
        }
        return null;
    }
}
