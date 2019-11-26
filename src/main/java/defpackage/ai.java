package defpackage;

import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map.Entry;

/* renamed from: ai */
public final class ai extends x {
    public z a;
    private final f b = new f();
    private final WeakReference c;
    private int d = 0;
    private boolean e = false;
    private boolean f = false;
    private final ArrayList g = new ArrayList();

    public ai(af afVar) {
        this.c = new WeakReference(afVar);
        this.a = z.INITIALIZED;
    }

    public final void a(aa aaVar) {
        a(ai.b(aaVar));
    }

    public final void a(z zVar) {
        if (this.a != zVar) {
            this.a = zVar;
            if (this.e || this.d != 0) {
                this.f = true;
            } else {
                this.e = true;
                c();
                this.e = false;
            }
        }
    }

    private final z c(ag agVar) {
        z zVar;
        f fVar = this.b;
        z zVar2 = null;
        j jVar = fVar.c(agVar) ? ((j) fVar.a.get(agVar)).d : null;
        if (jVar == null) {
            zVar = null;
        } else {
            zVar = ((ah) jVar.b).a;
        }
        if (!this.g.isEmpty()) {
            ArrayList arrayList = this.g;
            zVar2 = (z) arrayList.get(arrayList.size() - 1);
        }
        return ai.a(ai.a(this.a, zVar), zVar2);
    }

    public final void a(ag agVar) {
        ah ahVar = new ah(agVar, this.a != z.DESTROYED ? z.INITIALIZED : z.DESTROYED);
        if (((ah) this.b.a(agVar, ahVar)) == null) {
            af afVar = (af) this.c.get();
            if (afVar != null) {
                Object obj = (this.d != 0 || this.e) ? 1 : null;
                Enum c = c(agVar);
                this.d++;
                while (ahVar.a.compareTo(c) < 0 && this.b.c(agVar)) {
                    b(ahVar.a);
                    ahVar.a(afVar, ai.c(ahVar.a));
                    b();
                    c = c(agVar);
                }
                if (obj == null) {
                    c();
                }
                this.d--;
            }
        }
    }

    private final void b() {
        ArrayList arrayList = this.g;
        arrayList.remove(arrayList.size() - 1);
    }

    private final void b(z zVar) {
        this.g.add(zVar);
    }

    public final void b(ag agVar) {
        this.b.b(agVar);
    }

    public final z a() {
        return this.a;
    }

    static z b(aa aaVar) {
        int ordinal = aaVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return z.RESUMED;
                }
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return z.DESTROYED;
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unexpected event value ");
                        stringBuilder.append(aaVar);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
            }
            return z.STARTED;
        }
        return z.CREATED;
    }

    private static aa c(z zVar) {
        int ordinal = zVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return aa.ON_CREATE;
        }
        if (ordinal == 2) {
            return aa.ON_START;
        }
        if (ordinal == 3) {
            return aa.ON_RESUME;
        }
        if (ordinal != 4) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected state value ");
            stringBuilder.append(zVar);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        throw new IllegalArgumentException();
    }

    private final void c() {
        af afVar = (af) this.c.get();
        if (afVar != null) {
            while (true) {
                f fVar = this.b;
                if (fVar.e == 0) {
                    break;
                }
                z zVar = ((ah) fVar.b.b).a;
                z zVar2 = ((ah) fVar.c.b).a;
                if (zVar == zVar2 && this.a == zVar2) {
                    break;
                }
                ah ahVar;
                this.f = false;
                if (this.a.compareTo(zVar) < 0) {
                    fVar = this.b;
                    k kVar = new k(fVar.c, fVar.b);
                    fVar.d.put(kVar, Boolean.valueOf(false));
                    while (kVar.hasNext() && !this.f) {
                        Entry entry = (Entry) kVar.next();
                        ahVar = (ah) entry.getValue();
                        while (ahVar.a.compareTo(this.a) > 0 && !this.f && this.b.c(entry.getKey())) {
                            z zVar3 = ahVar.a;
                            int ordinal = zVar3.ordinal();
                            if (ordinal == 0) {
                                throw new IllegalArgumentException();
                            } else if (ordinal != 1) {
                                aa aaVar;
                                if (ordinal == 2) {
                                    aaVar = aa.ON_DESTROY;
                                } else if (ordinal == 3) {
                                    aaVar = aa.ON_STOP;
                                } else if (ordinal == 4) {
                                    aaVar = aa.ON_PAUSE;
                                } else {
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append("Unexpected state value ");
                                    stringBuilder.append(zVar3);
                                    throw new IllegalArgumentException(stringBuilder.toString());
                                }
                                b(ai.b(aaVar));
                                ahVar.a(afVar, aaVar);
                                b();
                            } else {
                                throw new IllegalArgumentException();
                            }
                        }
                    }
                }
                j jVar = this.b.c;
                if (!(this.f || jVar == null || this.a.compareTo(((ah) jVar.b).a) <= 0)) {
                    m a = this.b.a();
                    while (a.hasNext() && !this.f) {
                        Entry entry2 = (Entry) a.next();
                        ahVar = (ah) entry2.getValue();
                        while (ahVar.a.compareTo(this.a) < 0 && !this.f && this.b.c(entry2.getKey())) {
                            b(ahVar.a);
                            ahVar.a(afVar, ai.c(ahVar.a));
                            b();
                        }
                    }
                }
            }
            this.f = false;
            return;
        }
        Log.w("LifecycleRegistry", "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it.");
    }

    static z a(z zVar, z zVar2) {
        return (zVar2 == null || zVar2.compareTo(zVar) >= 0) ? zVar : zVar2;
    }
}
