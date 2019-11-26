package defpackage;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: bbk */
final class bbk extends Handler {
    private final ArrayList a = new ArrayList();
    private final /* synthetic */ bbf b;

    bbk(bbf bbf) {
        this.b = bbf;
    }

    public final void a(int i, Object obj) {
        obtainMessage(i, obj).sendToTarget();
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        Object obj = message.obj;
        int i2 = message.arg1;
        if (i == 259 && this.b.b().c.equals(((bbs) obj).c)) {
            this.b.a(true);
        }
        if (i != 262) {
            switch (i) {
                case 257:
                    this.b.g.a((bbs) obj);
                    break;
                case 258:
                    this.b.g.b((bbs) obj);
                    break;
                case 259:
                    this.b.g.c((bbs) obj);
                    break;
            }
        }
        this.b.g.d((bbs) obj);
        try {
            int size = this.b.b.size();
            while (true) {
                size--;
                if (size >= 0) {
                    bbb bbb = (bbb) ((WeakReference) this.b.b.get(size)).get();
                    if (bbb == null) {
                        this.b.b.remove(size);
                    } else {
                        this.a.addAll(bbb.b);
                    }
                } else {
                    size = this.a.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        bbd bbd = (bbd) this.a.get(i3);
                        bbb bbb2 = bbd.a;
                        bbe bbe = bbd.b;
                        int i4 = 65280 & i;
                        if (i4 != 256) {
                            if (i4 == 512) {
                                switch (i) {
                                    case 513:
                                        bbe.a();
                                        break;
                                    case 514:
                                        bbe.b();
                                        break;
                                    case 515:
                                        bbe.c();
                                        break;
                                    default:
                                        break;
                                }
                            }
                        } else {
                            bbs bbs = (bbs) obj;
                            if ((bbd.d & 2) != 0 || bbs.a(bbd.c)) {
                                switch (i) {
                                    case 257:
                                        bbe.a(bbb2, bbs);
                                        break;
                                    case 258:
                                        bbe.b(bbb2, bbs);
                                        break;
                                    case 259:
                                        bbe.c(bbb2, bbs);
                                        break;
                                    case 260:
                                        bbe.c(bbs);
                                        break;
                                    case 262:
                                        bbe.a(bbs);
                                        break;
                                    case 263:
                                        bbe.a(bbs, i2);
                                        break;
                                    default:
                                        break;
                                }
                            }
                        }
                    }
                    return;
                }
            }
        } finally {
            this.a.clear();
        }
    }
}
