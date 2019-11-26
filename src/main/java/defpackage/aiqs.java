package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aiqs */
public final class aiqs {
    public apxu a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public Boolean f;
    public long g = -1;
    public nkm h;
    public String i;
    public String j;
    public String k;
    public int l = 1;
    private List m;
    private Boolean n;
    private Boolean o;
    private final int p = 1;

    private aiqs() {
    }

    public final aiqs a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        amqw.a(arrayList.isEmpty() ^ 1);
        this.m = arrayList;
        return this;
    }

    public final aiqs a() {
        this.o = Boolean.valueOf(true);
        return this;
    }

    public final aiqs a(boolean z) {
        this.n = Boolean.valueOf(z);
        return this;
    }

    public final aiqq b() {
        nkm nkm;
        anxo anxo;
        int a;
        nkm nkm2;
        boolean z;
        Object obj = "Only one of localProto, command, videoIdList can be set";
        if (this.h != null) {
            amqw.a(this.m == null, obj);
            if (this.a == null) {
                nkm = this.h;
                apxu apxu = null;
                if (!(nkm == null || (nkm.a & 524288) == 0)) {
                    try {
                        apxu = (apxu) anxl.parseFrom(apxu.d, nkm.s.d(), anxa.c());
                    } catch (anyg unused) {
                    }
                }
                this.a = apxu;
            }
        } else if (this.a != null) {
            amqw.a(this.m == null, obj);
        }
        if (!(this.i == null && this.j == null && this.k == null)) {
            amqw.a(this.h != null, (Object) "Can only set videoId/playlistId/playerParams when localProto is set");
        }
        nkm = this.h;
        if (nkm == null) {
            apxu apxu2 = this.a;
            nkm nkm3;
            if (apxu2 != null) {
                anxl c;
                aiqv a2 = aiqx.a(apxu2);
                if (a2 != null) {
                    c = a2.c(apxu2);
                } else {
                    c = nkm.x;
                }
                anxo = (nkn) ((anxo) c.toBuilder());
                anvu a3 = anvu.a(this.a.toByteArray());
                anxo.copyOnWrite();
                nkm3 = (nkm) anxo.instance;
                if (a3 != null) {
                    nkm3.a = 524288 | nkm3.a;
                    nkm3.s = a3;
                    apxu apxu3 = this.a;
                    anxr access$000 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
                    apxu3.a(access$000);
                    if (apxu3.h.a(access$000.d)) {
                        apxu3 = this.a;
                        access$000 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
                        apxu3.a(access$000);
                        Object b = apxu3.h.b(access$000.d);
                        if (b == null) {
                            b = access$000.b;
                        } else {
                            b = access$000.a(b);
                        }
                        a = azjc.a(((azje) b).l);
                        if (a == 0) {
                            a = 1;
                        }
                        this.l = a;
                    }
                    anvu anvu = this.a.b;
                    anxo.copyOnWrite();
                    nkm2 = (nkm) anxo.instance;
                    if (anvu != null) {
                        nkm2.a |= 16;
                        nkm2.g = anvu;
                        anxo.copyOnWrite();
                        nkm nkm4 = (nkm) anxo.instance;
                        nkm4.a |= 128;
                        nkm4.j = true;
                    } else {
                        throw new NullPointerException();
                    }
                }
                throw new NullPointerException();
            } else if (this.m != null) {
                anxo = (nkn) nkm.x.createBuilder();
                List list = this.m;
                anxo.copyOnWrite();
                nkm3 = (nkm) anxo.instance;
                if (!nkm3.c.a()) {
                    nkm3.c = anxl.mutableCopy(nkm3.c);
                }
                anvf.addAll(list, nkm3.c);
                anxo.b("");
                a = this.b;
                z = (a >= 0 || a == -1) && a < this.m.size();
                amqw.b(z);
                anxo.a((String) this.m.get(Math.max(0, this.b)));
                anxo.a(this.b);
                anxo.b(false);
                anxo.a(false);
            } else {
                anxo = (nkn) nkm.x.createBuilder();
            }
        } else {
            anxo = (nkn) ((anxo) nkm.toBuilder());
        }
        z = this.c;
        anxo.copyOnWrite();
        nkm2 = (nkm) anxo.instance;
        nkm2.a |= 4096;
        nkm2.o = z;
        z = this.d;
        anxo.copyOnWrite();
        nkm2 = (nkm) anxo.instance;
        nkm2.a |= 8388608;
        nkm2.u = z;
        z = this.e;
        anxo.copyOnWrite();
        nkm2 = (nkm) anxo.instance;
        nkm2.a |= 4194304;
        nkm2.t = z;
        long j = this.g;
        if (j > -1) {
            anxo.a(j);
        }
        Boolean bool = this.n;
        if (bool != null) {
            anxo.c(bool.booleanValue());
        }
        bool = this.o;
        if (bool != null) {
            anxo.b(bool.booleanValue());
        }
        bool = this.f;
        if (bool != null) {
            anxo.d(bool.booleanValue());
        }
        String str = this.i;
        if (str != null) {
            anxo.a(str);
        }
        str = this.j;
        if (str != null) {
            anxo.b(str);
        }
        str = this.k;
        if (str != null) {
            anxo.d(str);
        }
        a = this.p;
        if (a != 1) {
            anxo.copyOnWrite();
            nkm nkm5 = (nkm) anxo.instance;
            if (a != 0) {
                nkm5.a |= 67108864;
                nkm5.v = a - 1;
            } else {
                throw new NullPointerException();
            }
        }
        this.h = (nkm) ((anxl) anxo.build());
        return new aiqq(this.h, this.l, this.a);
    }

    /* synthetic */ aiqs(byte b) {
    }
}
