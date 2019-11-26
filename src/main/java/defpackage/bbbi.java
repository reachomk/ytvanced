package defpackage;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bbbi */
final class bbbi implements Runnable {
    public final /* synthetic */ bbbe a;
    private final bavd b;

    bbbi(bbbe bbbe, bavd bavd) {
        this.a = bbbe;
        this.b = (bavd) amqw.a((Object) bavd, (Object) "savedListener");
    }

    public final void run() {
        String valueOf;
        String str;
        bavd bavd;
        String str2 = "Unable to resolve host ";
        String str3 = "io.grpc.internal.DnsNameResolver$Resolve";
        if (bbbe.a.isLoggable(Level.FINER)) {
            Logger logger = bbbe.a;
            Level level = Level.FINER;
            valueOf = String.valueOf(this.a.k);
            str = "Attempting DNS resolution of ";
            logger.logp(level, str3, "run", valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
        }
        bavx bavx;
        try {
            bbbe bbbe = this.a;
            try {
                bavp a = this.a.g.a(InetSocketAddress.createUnresolved(bbbe.k, bbbe.l));
                String str4 = "resolveInternal";
                bavf a2;
                if (a == null) {
                    bbbj bbbj;
                    if (bbbe.a(bbbe.b, bbbe.c, this.a.k)) {
                        bbbj = (bbbj) this.a.j.get();
                        if (bbbj == null && bbbe.f != null) {
                            bbbj = bbbe.f.a();
                        }
                    } else {
                        bbbj = null;
                    }
                    bbbf a3 = bbbe.a(this.a.i, bbbj, bbbe.d, bbbe.e, this.a.k);
                    this.a.n.execute(new bbbk(this, a3));
                    if (bbbe.a.isLoggable(Level.FINER)) {
                        Logger logger2 = bbbe.a;
                        Level level2 = Level.FINER;
                        String valueOf2 = String.valueOf(a3);
                        String str5 = this.a.k;
                        StringBuilder stringBuilder = new StringBuilder((valueOf2.length() + 23) + String.valueOf(str5).length());
                        stringBuilder.append("Found DNS results ");
                        stringBuilder.append(valueOf2);
                        stringBuilder.append(" for ");
                        stringBuilder.append(str5);
                        logger2.logp(level2, str3, str4, stringBuilder.toString());
                    }
                    ArrayList arrayList = new ArrayList();
                    for (InetAddress inetSocketAddress : a3.a) {
                        arrayList.add(new batd(new InetSocketAddress(inetSocketAddress, this.a.l)));
                    }
                    arrayList.addAll(a3.c);
                    if (arrayList.isEmpty()) {
                        bavd bavd2 = this.b;
                        bavx bavx2 = bavx.j;
                        str3 = "No DNS backend or balancer addresses found for ";
                        str4 = String.valueOf(this.a.k);
                        if (str4.length() == 0) {
                            str4 = new String(str3);
                        } else {
                            str4 = str3.concat(str4);
                        }
                        bavd2.a(bavx2.a(str4));
                    } else {
                        barp a4 = barq.a();
                        if (a3.b.isEmpty()) {
                            bbbe.a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver$Resolve", "resolveInternal", "No TXT records found for {0}", new Object[]{this.a.k});
                        } else {
                            bavb a5 = bbbe.a(a3.b, this.a.h, bbbe.d());
                            if (a5 != null) {
                                bavx = a5.a;
                                if (bavx == null) {
                                    a4.a(bbbv.a, (Map) a5.b);
                                } else {
                                    this.b.a(bavx);
                                }
                            }
                        }
                        a2 = bavg.a();
                        a2.a = arrayList;
                        a2.b = a4.a();
                        this.b.a(a2.a());
                    }
                } else {
                    if (bbbe.a.isLoggable(Level.FINER)) {
                        Logger logger3 = bbbe.a;
                        Level level3 = Level.FINER;
                        str = String.valueOf(a);
                        StringBuilder stringBuilder2 = new StringBuilder(str.length() + 20);
                        stringBuilder2.append("Using proxy address ");
                        stringBuilder2.append(str);
                        logger3.logp(level3, str3, str4, stringBuilder2.toString());
                    }
                    batd batd = new batd(a);
                    a2 = bavg.a();
                    a2.a = Collections.singletonList(batd);
                    a2.b = barq.b;
                    this.b.a(a2.a());
                }
            } catch (IOException e) {
                bavd = this.b;
                bavx = bavx.j;
                valueOf = String.valueOf(this.a.k);
                if (valueOf.length() == 0) {
                    valueOf = new String(str2);
                } else {
                    valueOf = str2.concat(valueOf);
                }
                bavd.a(bavx.a(valueOf).b(e));
            }
        } catch (Exception e2) {
            bavd = this.b;
            bavx = bavx.j;
            valueOf = String.valueOf(this.a.k);
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bavd.a(bavx.a(valueOf).b(e2));
        } catch (Throwable th) {
            this.a.n.execute(new bbbh(this));
        }
        this.a.n.execute(new bbbh(this));
    }
}
