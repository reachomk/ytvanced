package defpackage;

import android.text.Spanned;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareToContactsEndpoint;
import com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareToConversationEndpoint;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: allh */
public final class allh {
    public final Set a = new HashSet();
    public final List b = new ArrayList();
    public final Map c = new HashMap();
    public final Set d = new HashSet();
    public final Map e = new HashMap();
    public final List f = new ArrayList();
    public int g;
    public CharSequence h;
    public CharSequence i;
    public apxu j;
    public boolean k;
    public String l;
    public String m = "";
    public boolean n;
    private final Set o = Collections.newSetFromMap(new WeakHashMap());
    private final Set p = Collections.newSetFromMap(new WeakHashMap());

    public final void a(alli alli) {
        xak.a();
        this.o.add(alli);
    }

    public final void b(alli alli) {
        xak.a();
        this.o.remove(alli);
    }

    public final void a(allj allj) {
        xak.a();
        this.p.add(allj);
        c(allj);
    }

    public final void b(allj allj) {
        xak.a();
        this.p.remove(allj);
    }

    public final void a(String str, boolean z) {
        xak.a();
        if (this.c.containsKey(str)) {
            if (z) {
                if (this.d.size() >= this.g) {
                    if (!TextUtils.isEmpty(this.h) && !TextUtils.isEmpty(this.i)) {
                        for (alli a : this.o) {
                            if (a.a(this.h, this.i)) {
                                break;
                            }
                        }
                    }
                } else if (this.d.add(str)) {
                    i();
                    j();
                }
            } else if (this.d.remove(str)) {
                i();
                j();
            }
        }
    }

    public final boolean a(String str) {
        return this.c.containsKey(str);
    }

    public final void a() {
        xak.a();
        this.l = null;
        this.d.clear();
        j();
    }

    public final boolean b() {
        return c() || !this.d.isEmpty();
    }

    public final boolean c() {
        return TextUtils.isEmpty(this.l) ^ 1;
    }

    public final boolean d() {
        return this.d.isEmpty() ^ 1;
    }

    public final Collection e() {
        ArrayList arrayList = new ArrayList(this.d.size());
        for (String str : this.d) {
            arrayList.add((allg) this.c.get(str));
        }
        return arrayList;
    }

    public final boolean b(String str) {
        return TextUtils.equals(this.l, str) || this.d.contains(str);
    }

    public final int f() {
        return TextUtils.isEmpty(this.l) ? this.d.size() : 1;
    }

    public final void c(String str) {
        if (str == null) {
            str = "";
        }
        this.m = str;
        i();
        j();
    }

    public final Spanned g() {
        aqkn aqkn = null;
        Object obj = 1;
        for (String str : this.d) {
            allg allg = (allg) this.c.get(str);
            if (allg.b && aqkn == null) {
                aqkn = (aqkn) this.e.get(str);
            }
            if (!allg.b) {
                obj = null;
            }
        }
        if (aqkn == null) {
            return null;
        }
        arml arml;
        if (f() == 1) {
            arml = aqkn.c;
            if (arml == null) {
                arml = arml.f;
            }
            return ajqy.a(arml);
        } else if (obj != null) {
            arml = aqkn.d;
            if (arml == null) {
                arml = arml.f;
            }
            return ajqy.a(arml);
        } else {
            arml = aqkn.e;
            if (arml == null) {
                arml = arml.f;
            }
            return ajqy.a(arml);
        }
    }

    public final arwf h() {
        aqkn aqkn;
        for (String str : this.d) {
            if (((allg) this.c.get(str)).b) {
                aqkn = (aqkn) this.e.get(str);
                break;
            }
        }
        aqkn = null;
        if (aqkn == null) {
            return null;
        }
        arwf arwf = aqkn.b;
        if (arwf == null) {
            arwf = arwf.c;
        }
        return arwf;
    }

    public final void a(aphg aphg) {
        anxq anxq;
        if (aphg != null && (aphg.a & 2048) != 0) {
            anxl anxl = aphg.l;
            if (anxl == null) {
                anxl = apxu.d;
            }
            anxq = (apxx) ((anxo) anxl.toBuilder());
        } else if (this.j == null) {
            anxq = (apxx) apxu.d.createBuilder();
            anxq.a(SendShareEndpoint$SendShareToContactsEndpoint.sendShareToContactsEndpoint, SendShareEndpoint$SendShareToContactsEndpoint.f);
        } else {
            return;
        }
        axfl axfl = (axfl) ((anxo) ((SendShareEndpoint$SendShareToContactsEndpoint) anxq.b(SendShareEndpoint$SendShareToContactsEndpoint.sendShareToContactsEndpoint)).toBuilder());
        if ((((SendShareEndpoint$SendShareToContactsEndpoint) axfl.instance).a & 1) == 0) {
            axfl.a(asfa.f);
        }
        if ((((SendShareEndpoint$SendShareToContactsEndpoint) axfl.instance).a & 2) == 0) {
            ases ases = ases.c;
            axfl.copyOnWrite();
            SendShareEndpoint$SendShareToContactsEndpoint sendShareEndpoint$SendShareToContactsEndpoint = (SendShareEndpoint$SendShareToContactsEndpoint) axfl.instance;
            if (ases != null) {
                sendShareEndpoint$SendShareToContactsEndpoint.c = ases;
                sendShareEndpoint$SendShareToContactsEndpoint.a |= 2;
            } else {
                throw new NullPointerException();
            }
        }
        anxq.a(SendShareEndpoint$SendShareToContactsEndpoint.sendShareToContactsEndpoint, (SendShareEndpoint$SendShareToContactsEndpoint) ((anxl) axfl.build()));
        this.j = (apxu) ((anxl) anxq.build());
    }

    public final void i() {
        apxu apxu = this.j;
        if (apxu != null) {
            apxx apxx = (apxx) ((anxo) apxu.toBuilder());
            apxu apxu2;
            anxr access$000;
            Object b;
            if (c()) {
                String str;
                axfm axfm = (axfm) SendShareEndpoint$SendShareToConversationEndpoint.f.createBuilder();
                asex asex = (asex) aseu.c.createBuilder();
                if (this.k) {
                    str = this.l;
                    asex.copyOnWrite();
                    aseu aseu = (aseu) asex.instance;
                    if (str != null) {
                        if (!aseu.b.a()) {
                            aseu.b = anxl.mutableCopy(aseu.b);
                        }
                        aseu.b.add(str);
                    } else {
                        throw new NullPointerException();
                    }
                }
                asex.a(this.l);
                axfm.copyOnWrite();
                SendShareEndpoint$SendShareToConversationEndpoint sendShareEndpoint$SendShareToConversationEndpoint = (SendShareEndpoint$SendShareToConversationEndpoint) axfm.instance;
                sendShareEndpoint$SendShareToConversationEndpoint.c = (aseu) ((anxl) asex.build());
                sendShareEndpoint$SendShareToConversationEndpoint.a |= 2;
                asfd asfd = (asfd) asfa.f.createBuilder();
                asfd.a(this.m);
                apxu2 = this.j;
                access$000 = anxl.checkIsLite(SendShareEndpoint$SendShareToContactsEndpoint.sendShareToContactsEndpoint);
                apxu2.a(access$000);
                b = apxu2.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                asfa asfa = ((SendShareEndpoint$SendShareToContactsEndpoint) b).b;
                if (asfa == null) {
                    asfa = asfa.f;
                }
                str = asfa.b;
                asfd.copyOnWrite();
                asfa asfa2 = (asfa) asfd.instance;
                if (str != null) {
                    asfa2.a |= 1;
                    asfa2.b = str;
                    axfm.a(asfd);
                    apxx.a(SendShareEndpoint$SendShareToConversationEndpoint.sendShareToConversationEndpoint, (SendShareEndpoint$SendShareToConversationEndpoint) ((anxl) axfm.build()));
                    apxx.c(SendShareEndpoint$SendShareToContactsEndpoint.sendShareToContactsEndpoint);
                } else {
                    throw new NullPointerException();
                }
            } else if (d()) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (allg allg : e()) {
                    if (allg.b) {
                        arrayList2.add(allg.a);
                    } else {
                        arrayList.add(allg.a);
                    }
                }
                apxu2 = this.j;
                access$000 = anxl.checkIsLite(SendShareEndpoint$SendShareToContactsEndpoint.sendShareToContactsEndpoint);
                apxu2.a(access$000);
                b = apxu2.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                axfl axfl = (axfl) ((anxo) ((SendShareEndpoint$SendShareToContactsEndpoint) b).toBuilder());
                anxl anxl = ((SendShareEndpoint$SendShareToContactsEndpoint) axfl.instance).c;
                if (anxl == null) {
                    anxl = ases.c;
                }
                asev asev = (asev) ((anxo) anxl.toBuilder());
                asev.copyOnWrite();
                ((ases) asev.instance).a = anxl.emptyProtobufList();
                asev.copyOnWrite();
                ases ases = (ases) asev.instance;
                ases.a();
                anvf.addAll(arrayList, ases.a);
                asev.copyOnWrite();
                ((ases) asev.instance).b = anxl.emptyProtobufList();
                asev.copyOnWrite();
                ases ases2 = (ases) asev.instance;
                if (!ases2.b.a()) {
                    ases2.b = anxl.mutableCopy(ases2.b);
                }
                anvf.addAll(arrayList2, ases2.b);
                axfl.a(asev);
                anxl anxl2 = ((SendShareEndpoint$SendShareToContactsEndpoint) axfl.instance).b;
                if (anxl2 == null) {
                    anxl2 = asfa.f;
                }
                asfd asfd2 = (asfd) ((anxo) anxl2.toBuilder());
                asfd2.a(this.m);
                axfl.copyOnWrite();
                SendShareEndpoint$SendShareToContactsEndpoint sendShareEndpoint$SendShareToContactsEndpoint = (SendShareEndpoint$SendShareToContactsEndpoint) axfl.instance;
                sendShareEndpoint$SendShareToContactsEndpoint.b = (asfa) ((anxl) asfd2.build());
                sendShareEndpoint$SendShareToContactsEndpoint.a |= 1;
                apxx.a(SendShareEndpoint$SendShareToContactsEndpoint.sendShareToContactsEndpoint, (SendShareEndpoint$SendShareToContactsEndpoint) ((anxl) axfl.build()));
                apxx.c(SendShareEndpoint$SendShareToConversationEndpoint.sendShareToConversationEndpoint);
            } else {
                apxx.c(SendShareEndpoint$SendShareToContactsEndpoint.sendShareToContactsEndpoint);
                apxx.c(SendShareEndpoint$SendShareToConversationEndpoint.sendShareToConversationEndpoint);
            }
            this.j = (apxu) ((anxl) apxx.build());
        }
    }

    public final void j() {
        for (allj c : this.p) {
            c(c);
        }
    }

    private final void c(allj allj) {
        allj.a(this);
    }
}
