package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.List;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: agov */
public final class agov implements ovg {
    private final agpb a;
    private final List b;
    private final agvt c;
    private agoy d = null;

    public agov(agpb agpb, List list, agvt agvt) {
        this.a = agpb;
        this.b = list;
        this.c = agvt;
    }

    public final void a(ovm ovm) {
        amqw.a(ovm.g, (Object) "no cache key in data spec?!");
        String str = ovm.g;
        String a = aeey.a(str);
        String b = aeey.b(str);
        azlk a2 = ahdh.a(a, aajy.a(b), aajy.b(b), aeey.c(str));
        amqw.a(a2.b.isEmpty() ^ 1, (Object) "Could not find video ID in data spec?!");
        agpc a3 = this.a.a();
        a3.a(a2);
        a3.a(ovm.d);
        this.d = new agoy(ovm.d, a(a2.c), a3);
    }

    public final void a(byte[] bArr, int i, int i2) {
        agoy agoy = (agoy) amqw.a(this.d, (Object) "DataSink not open!");
        try {
            int i3;
            int i4;
            azxx azxx = agoy.b;
            long j = agoy.a;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            azxx.a.init(1, azxx.b, new IvParameterSpec(azxx.a(j)));
            int a = (int) (j % ((long) azxx.a()));
            int min = Math.min(a != 0 ? azxx.a() - a : 0, length);
            if (a == 0) {
                i3 = min;
                i4 = 0;
            } else {
                Object obj = new byte[azxx.a()];
                Object obj2 = obj;
                int i5 = min;
                int i6 = a;
                azxx.a.doFinal(bArr, 0, min, obj2, azxx.a.update(new byte[a], 0, a, obj, 0));
                i3 = i5;
                i4 = 0;
                System.arraycopy(obj2, i6, bArr2, 0, i3);
                azxx.a.init(1, azxx.b, new IvParameterSpec(azxx.a(j + ((long) i3))));
            }
            min = length - i3;
            if (min != 0) {
                i4 = azxx.a.doFinal(bArr, i3, min, bArr2, i3);
            }
            if (i3 + i4 == length) {
                agoy.a += (long) agoy.c.a(bArr2, i, i2);
                return;
            }
            throw new GeneralSecurityException("Cipher has wrong size");
        } catch (GeneralSecurityException e) {
            throw new agml(e);
        }
    }

    public final void a() {
        agoy agoy = this.d;
        if (agoy != null) {
            agoy.c.a();
            if (agoy.c.c()) {
                for (azle azle : this.b) {
                    if ((azle.a & 1) != 0) {
                        agvt agvt = this.c;
                        azlk azlk = azle.b;
                        if (azlk == null) {
                            azlk = azlk.f;
                        }
                        String str = azlk.b;
                        azlk azlk2 = azle.b;
                        if (azlk2 == null) {
                            azlk2 = azlk.f;
                        }
                        int a = agvt.a(str, azlk2.c);
                        if (a >= 0) {
                            agvt = this.c;
                            azlk = azle.b;
                            if (azlk == null) {
                                azlk = azlk.f;
                            }
                            str = azlk.b;
                            azlk2 = azle.b;
                            if (azlk2 == null) {
                                azlk2 = azlk.f;
                            }
                            agqd a2 = agvt.a(str, azlk2.c, a);
                            if (a2 != null) {
                                azlh azlh = (azlh) azli.f.createBuilder();
                                azlh.copyOnWrite();
                                azli azli = (azli) azlh.instance;
                                azli.a |= 1;
                                azli.b = 2;
                                azlh.copyOnWrite();
                                azli = (azli) azlh.instance;
                                azli.a = 2 | azli.a;
                                azli.c = 4096;
                                azlh.copyOnWrite();
                                azli = (azli) azlh.instance;
                                azli.a |= 4;
                                azli.e = a;
                                amqa a3 = aobo.a.a();
                                int e = a2.e() + 1;
                                byte[][] bArr = new byte[e][];
                                agvt agvt2 = this.c;
                                azlk azlk3 = azle.b;
                                if (azlk3 == null) {
                                    azlk3 = azlk.f;
                                }
                                String str2 = azlk3.b;
                                azlk azlk4 = azle.b;
                                if (azlk4 == null) {
                                    azlk4 = azlk.f;
                                }
                                for (agqd agqd : agvt2.a(str2, azlk4.c, a, 0, e)) {
                                    byte[] f = agqd.f();
                                    if (f != null) {
                                        bArr[agqd.e()] = f;
                                    }
                                }
                                Iterable a4 = a3.a(Arrays.asList(bArr));
                                azlh.copyOnWrite();
                                azli = (azli) azlh.instance;
                                if (!azli.d.a()) {
                                    azli.d = anxl.mutableCopy(azli.d);
                                }
                                anvf.addAll(a4, azli.d);
                                azli azli2 = (azli) ((anxl) azlh.build());
                                azqc azqc = (azqc) azqd.d.createBuilder();
                                azlk azlk5 = azle.b;
                                if (azlk5 == null) {
                                    azlk5 = azlk.f;
                                }
                                azqc.copyOnWrite();
                                azqd azqd = (azqd) azqc.instance;
                                if (azlk5 != null) {
                                    azqd.b = azlk5;
                                    azqd.a |= 1;
                                    azqc.copyOnWrite();
                                    azqd azqd2 = (azqd) azqc.instance;
                                    if (azli2 != null) {
                                        azqd2.c = azli2;
                                        azqd2.a |= 4;
                                        agoy.c.a((azqd) ((anxl) azqc.build()));
                                    } else {
                                        throw new NullPointerException();
                                    }
                                }
                                throw new NullPointerException();
                            }
                            continue;
                        } else {
                            continue;
                        }
                    }
                }
                agoy.c.b();
            }
            agoy.c.close();
            this.d = null;
        }
    }

    private final azxx a(int i) {
        for (azle azle : this.b) {
            if ((azle.a & 1) != 0) {
                azlk azlk = azle.b;
                if (azlk == null) {
                    azlk = azlk.f;
                }
                if (azlk.c == i) {
                    int i2 = azle.a;
                    if (!((i2 & 4) == 0 || (i2 & 8) == 0)) {
                        try {
                            return new azxx(((azxz) ((azxy) ((anvi) ((azxy) azxz.c.createBuilder()).mergeFrom(azle.d.d(), anxa.c()))).instance).b.d(), azle.e.d());
                        } catch (GeneralSecurityException e) {
                            throw new agml(e);
                        }
                    }
                }
                continue;
            }
        }
        StringBuilder stringBuilder = new StringBuilder(57);
        stringBuilder.append("Found no encryption info for stream with itag ");
        stringBuilder.append(i);
        throw new agml(stringBuilder.toString());
    }
}
