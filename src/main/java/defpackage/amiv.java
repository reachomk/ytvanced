package defpackage;

/* renamed from: amiv */
final /* synthetic */ class amiv implements Runnable {
    private final amir a;
    private final amjc b;
    private final String c;
    private final amip d;

    amiv(amir amir, amjc amjc, String str, amip amip) {
        this.a = amir;
        this.b = amjc;
        this.c = str;
        this.d = amip;
    }

    public final void run() {
        String str = "UploadTaskController";
        amir amir = this.a;
        amjc amjc = this.b;
        String str2 = this.c;
        amip amip = this.d;
        if (!amjc.a()) {
            try {
                amea a = amir.c.a(str2);
                if (a == null) {
                    xtl.a(str, "Cannot call executeOrUndoTask because job doesn't exist in database");
                    amjc.a.a(new NullPointerException());
                } else {
                    Object f;
                    ambw ambw;
                    int i;
                    asmz asmz;
                    anjv a2;
                    amec a3 = amip.a(a);
                    boolean z = a3 != null ? a.L : false;
                    String valueOf = String.valueOf(amip.a());
                    String str3 = !z ? " execute" : " undo";
                    String str4 = str3.length() == 0 ? new String(valueOf) : valueOf.concat(str3);
                    int i2 = 3;
                    if (a3 != null) {
                        if (amjq.a(a3)) {
                            String.valueOf(str4).concat(" skipped because State is already finished");
                            amir.a(str2, a3, amip, amjc, str4);
                            return;
                        }
                        int a4 = amee.a(a3.b);
                        if (a4 != 0 && a4 == 3 && a3.e > amir.a.a()) {
                            String.valueOf(str4).concat(" skipped because RETRY is not ready yet");
                            amir.a(str2, a3, amip, amjc, str4);
                            return;
                        }
                    }
                    if (z) {
                        f = amip.f();
                    } else {
                        f = amip.b();
                    }
                    if (!(f == null || a.M)) {
                        amcl e = f.e();
                        if (!e.b) {
                            String.valueOf(amip.a()).concat(" halted due to unmet requirements");
                            amjg a5 = amjd.a(str2);
                            a5.a(amuw.a(f));
                            amjc.a.a(a5.a());
                            ambw = amir.d;
                            int i3 = amip.g;
                            i = e.c;
                            if (str2 != null) {
                                aytk aytk = (aytk) ayth.e.createBuilder();
                                aysx a6 = ambw.a(str2);
                                aytk.copyOnWrite();
                                ayth ayth = (ayth) aytk.instance;
                                if (a6 != null) {
                                    ayth.b = a6;
                                    ayth.a |= 1;
                                    aytk.copyOnWrite();
                                    ayth ayth2 = (ayth) aytk.instance;
                                    if (i3 != 0) {
                                        ayth2.a |= 2;
                                        ayth2.c = i3 - 1;
                                        if (i == 1) {
                                            i2 = 2;
                                        } else if (i != 2) {
                                            i2 = i != 3 ? 1 : 4;
                                        }
                                        aytk.copyOnWrite();
                                        ayth ayth3 = (ayth) aytk.instance;
                                        ayth3.a |= 8;
                                        ayth3.d = i2 - 1;
                                        ayth3 = (ayth) ((anxl) aytk.build());
                                        if (ayth3 != null) {
                                            asmz = (asmz) asmw.f.createBuilder();
                                            asmz.copyOnWrite();
                                            asmw asmw = (asmw) asmz.instance;
                                            asmw.c = ayth3;
                                            asmw.b = 95;
                                            ambw.a.a((asmw) ((anxl) asmz.build()));
                                            return;
                                        }
                                    }
                                    throw new NullPointerException();
                                }
                                throw new NullPointerException();
                            }
                        }
                    }
                    long a7 = amir.a.a();
                    String.valueOf(str4).concat(" start");
                    if (z) {
                        a2 = amip.a(str2, amir.c);
                    } else {
                        ambw = amir.d;
                        i = amip.g;
                        if (str2 != null) {
                            asmz = (asmz) asmw.f.createBuilder();
                            asmz.a(ambw.a(str2, i));
                            ambw.a.a((asmw) ((anxl) asmz.build()));
                        }
                        a2 = amip.b(str2, amir.c);
                    }
                    amjc.a(a2);
                    anjf.a(a2, new amiz(amir, str2, amip, amjc, a7, z, str4, a2), amir.b);
                }
            } catch (alzc e2) {
                xtl.a(str, "Storage exception trying to read job before executing upload task", e2);
                amjc.a.a(e2);
            }
        }
    }
}
