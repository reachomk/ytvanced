package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: dvw */
public final class dvw implements xcp {
    private final aaas a;
    private final PriorityQueue b = new PriorityQueue();
    private long c;
    private boolean d;

    public dvw(aaas aaas) {
        this.a = aaas;
    }

    public final void a() {
        this.b.clear();
        this.c = 0;
        this.d = false;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{vow.class, vpa.class, ahkn.class, ahkm.class};
        } else if (i == 0) {
            if (((vow) obj).b == vra.VIDEO_ENDED) {
                while (!this.b.isEmpty()) {
                    this.a.a(((dvv) this.b.poll()).b, null);
                }
            }
            a();
        } else if (i == 1) {
            vpa vpa = (vpa) obj;
            if (vpa.a == vpb.AD_VIDEO_PLAY_REQUESTED) {
                a();
                aaga aaga = vpa.f;
                if (aaga != null) {
                    for (aols aols : aaga.e()) {
                        Collection emptyList;
                        long toMillis = TimeUnit.SECONDS.toMillis((long) aaga.n());
                        if ((aols.a & 1) != 0) {
                            aolu aolu = aols.b;
                            if (aolu == null) {
                                aolu = aolu.e;
                            }
                            int a = aolx.a(aolu.b);
                            if (a == 0) {
                                a = 1;
                            }
                            a--;
                            if (a == 1) {
                                toMillis = (long) Math.round(aolu.c * ((float) toMillis));
                            } else if (a != 2) {
                                emptyList = Collections.emptyList();
                            } else {
                                toMillis = aolu.d;
                            }
                            Collection arrayList = new ArrayList();
                            if ((aols.a & 2) != 0) {
                                apxu apxu = aols.c;
                                if (apxu == null) {
                                    apxu = apxu.d;
                                }
                                arrayList.add(new dvv(toMillis, apxu));
                            }
                            if ((aols.a & 4) != 0) {
                                apxu apxu2 = aols.d;
                                if (apxu2 == null) {
                                    apxu2 = apxu.d;
                                }
                                arrayList.add(new dvv(toMillis, apxu2));
                            }
                            emptyList = amul.a(arrayList);
                        } else {
                            emptyList = Collections.emptyList();
                        }
                        this.b.addAll(emptyList);
                    }
                }
            }
        } else if (i != 2) {
            if (i == 3) {
                ahkm ahkm = (ahkm) obj;
                if (!this.d) {
                    long j = ahkm.a;
                    if (j >= this.c) {
                        while (!this.b.isEmpty() && j >= ((dvv) this.b.peek()).a) {
                            this.a.a(((dvv) this.b.poll()).b, null);
                        }
                        this.c = j;
                    }
                }
            } else {
                StringBuilder stringBuilder = new StringBuilder(32);
                stringBuilder.append("unsupported op code: ");
                stringBuilder.append(i);
                throw new IllegalStateException(stringBuilder.toString());
            }
        } else if (((ahkn) obj).a == airi.VIDEO_REQUESTED) {
            this.d = true;
            return null;
        }
        return clsArr;
    }
}
