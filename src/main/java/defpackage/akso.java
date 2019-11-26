package defpackage;

import android.content.Context;
import android.text.Spanned;
import com.google.protos.youtube.api.innertube.ModifyReportFormCommandOuterClass$ModifyReportFormCommand;
import java.util.Map;

/* renamed from: akso */
public final class akso {
    public final Context a;
    public final aaas b;
    public final acvx c;

    public akso(Context context, aaas aaas, acvx acvx) {
        this.a = context;
        this.b = aaas;
        this.c = acvx;
    }

    public final void a(axav axav, Object obj) {
        if (!xsg.b(this.a).isFinishing()) {
            aksi aksi = new aksi(this.a, this.b, new akss(axav), new aksr(this, obj));
            if (!aksi.e.isShowing()) {
                arml arml;
                arml arml2;
                akst akst = aksi.d;
                akss akss = aksi.b;
                axav axav2 = akss.a;
                arml arml3 = null;
                if ((axav2.a & 2) != 0) {
                    arml = axav2.c;
                    if (arml == null) {
                        arml = arml.f;
                    }
                } else {
                    arml = null;
                }
                Spanned a = ajqy.a(arml);
                avum avum = akss.b;
                if ((avum.a & 1) != 0) {
                    arml2 = avum.c;
                    if (arml2 == null) {
                        arml2 = arml.f;
                    }
                } else {
                    arml2 = null;
                }
                akst.a.setText((Spanned) amql.a(a, ajqy.a(arml2)));
                akst = aksi.d;
                akst.b.setAdapter(aksi.f);
                akss akss2 = aksi.b;
                aaas aaas = aksi.a;
                axav = akss2.a;
                if ((axav.a & 8) != 0) {
                    arml3 = axav.e;
                    if (arml3 == null) {
                        arml3 = arml.f;
                    }
                }
                Spanned a2 = aabb.a(arml3, aaas, false);
                if (a2 != null) {
                    akst akst2 = aksi.d;
                    akst2.c.setText(a2);
                    akst2.c.setVisibility(0);
                }
                aksi.f.setNotifyOnChange(false);
                aksi.f.clear();
                aksi.f.addAll(aksi.b.b.b);
                aksi.f.setNotifyOnChange(true);
                aksi.e.show();
                aksi.a();
            }
        }
    }

    public final void a(avug avug, Map map) {
        if ((avug.a & 32) != 0) {
            aaas aaas = this.b;
            apxu apxu = avug.f;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, map);
        }
    }

    static void a(apxu apxu, aksi aksi) {
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(ModifyReportFormCommandOuterClass$ModifyReportFormCommand.modifyReportFormCommand);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(ModifyReportFormCommandOuterClass$ModifyReportFormCommand.modifyReportFormCommand);
                apxu.a(access$000);
                Object b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                int a = avcr.a(((ModifyReportFormCommandOuterClass$ModifyReportFormCommand) b).b);
                if (a == 0) {
                    a = 1;
                }
                if (a != 4) {
                    aphg aphg = null;
                    if (a == 5) {
                        akss akss = aksi.b;
                        aphj aphj = akss.a.h;
                        if (aphj == null) {
                            aphj = aphj.d;
                        }
                        if ((1 & aphj.a) != 0) {
                            aphj aphj2 = akss.a.h;
                            if (aphj2 == null) {
                                aphj2 = aphj.d;
                            }
                            aphg = aphj2.b;
                            if (aphg == null) {
                                aphg = aphg.s;
                            }
                        }
                        aksi.a(aphg);
                        return;
                    } else if (a == 2) {
                        apfo a2 = aksi.b.a();
                        if (a2 != null) {
                            arml arml;
                            akst akst = aksi.d;
                            if ((1 & a2.a) != 0) {
                                arml = a2.b;
                                if (arml == null) {
                                    arml = arml.f;
                                }
                            }
                            Spanned a3 = aabb.a(arml, aksi.a, false);
                            akst.d.setVisibility(0);
                            akst.e.setContentDescription(a3);
                            akst.e.setVisibility(0);
                            akst.f.setText(a3);
                            akst.f.setVisibility(0);
                            return;
                        }
                    } else if (a == 3) {
                        aksi.c();
                        return;
                    }
                }
                aksi.b();
            }
        }
    }
}
