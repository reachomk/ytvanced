package defpackage;

import android.content.Context;
import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.PacketCallback;
import com.google.mediapipe.framework.PacketGetter;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: zkz */
public final class zkz implements PacketCallback {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final Object c = new Object();
    private final Context d;

    zkz(Context context) {
        this.d = context.getApplicationContext();
    }

    public final void process(Packet packet) {
        byte[] a = PacketGetter.a(packet);
        List list = null;
        if (a == null) {
            xtl.c("Null byte[] from packet");
        } else {
            try {
                bacj bacj = (bacj) anxl.parseFrom(bacj.b, a, anxa.c());
                if (bacj.a.size() == 0) {
                    xtl.c("No output events");
                } else {
                    list = bacj.a;
                }
            } catch (anyg e) {
                xtl.a("Error parsing bytes from packet", e);
            }
        }
        if (list != null && !list.isEmpty()) {
            for (bacp bacp : list) {
                if (bacp.a == 1) {
                    new zlc(this, (bada) bacp.b, new File(this.d.getCacheDir(), zjz.e)).execute(new Void[0]);
                }
                if (bacp.a == 2) {
                    boolean z = ((bacr) bacp.b).b;
                    synchronized (this.c) {
                        for (zlb a2 : this.b) {
                            a2.a(true, z);
                        }
                    }
                }
                if (bacp.a == 3) {
                    synchronized (this.c) {
                        for (zlb a3 : this.b) {
                            a3.a(false, false);
                        }
                    }
                }
                if (bacp.a == 4) {
                    synchronized (this.c) {
                        for (zlb a32 : this.b) {
                            a32.a(true);
                        }
                    }
                }
                if (bacp.a == 5) {
                    synchronized (this.c) {
                        for (zlb a322 : this.b) {
                            a322.a(false);
                        }
                    }
                }
                if (bacp.a == 6) {
                    synchronized (this.c) {
                        for (zlb a3222 : this.b) {
                            bacl bacl;
                            int a4 = babi.a((bacp.a == 6 ? (bacl) bacp.b : bacl.d).b);
                            if (a4 != 0) {
                                if (a4 != 1) {
                                    if (bacp.a == 6) {
                                        bacl = (bacl) bacp.b;
                                    } else {
                                        bacl = bacl.d;
                                    }
                                    a4 = babi.a(bacl.b);
                                    if (a4 != 0 && a4 == 2) {
                                        if (bacp.a == 6) {
                                            bacl = (bacl) bacp.b;
                                        } else {
                                            bacl = bacl.d;
                                        }
                                        a3222.c(bacl.c);
                                    }
                                }
                            }
                            if (bacp.a == 6) {
                                bacl = (bacl) bacp.b;
                            } else {
                                bacl = bacl.d;
                            }
                            a3222.b(bacl.c);
                        }
                    }
                }
                if (bacp.a == 7) {
                    synchronized (this.c) {
                        for (zlb zlb : this.b) {
                            bacz bacz;
                            if (bacp.a == 7) {
                                bacz = (bacz) bacp.b;
                            } else {
                                bacz = bacz.g;
                            }
                            zlb.a(bacz);
                        }
                    }
                }
            }
        }
    }
}
