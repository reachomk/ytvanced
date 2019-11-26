package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.protos.youtube.api.innertube.FormfillCheckboxInputRendererOuterClass;
import com.google.protos.youtube.api.innertube.FormfillInputRendererOuterClass;
import com.google.protos.youtube.api.innertube.FormfillPhoneNumberInputRendererOuterClass;
import com.google.protos.youtube.api.innertube.FormfillTextInputRendererOuterClass;
import java.util.ArrayList;
import java.util.List;

/* renamed from: kor */
public final class kor {
    public final List a = new ArrayList();
    public ViewGroup b;
    private final Context c;
    private final aaas d;

    public kor(Context context, aaas aaas) {
        this.c = context;
        this.d = aaas;
    }

    public final void a(ViewGroup viewGroup, List list, acvx acvx) {
        this.b = viewGroup;
        for (axak axak : list) {
            anxr access$000;
            kop kop = null;
            if (axak != null) {
                access$000 = anxl.checkIsLite(FormfillInputRendererOuterClass.formfillInputRenderer);
                axak.a(access$000);
                if (axak.h.a(access$000.d)) {
                    Object obj;
                    access$000 = anxl.checkIsLite(FormfillInputRendererOuterClass.formfillInputRenderer);
                    axak.a(access$000);
                    Object b = axak.h.b(access$000.d);
                    if (b == null) {
                        obj = access$000.b;
                    } else {
                        obj = access$000.a(b);
                    }
                    arnb arnb = (arnb) obj;
                    anxp anxp = arnb.b;
                    if (anxp == null) {
                        anxp = axak.a;
                    }
                    anxr access$0002 = anxl.checkIsLite(FormfillTextInputRendererOuterClass.formfillTextInputRenderer);
                    anxp.a(access$0002);
                    Context context;
                    aaas aaas;
                    anxp anxp2;
                    anxr access$0003;
                    if (anxp.h.a(access$0002.d)) {
                        context = this.c;
                        aaas = this.d;
                        anxp2 = arnb.b;
                        if (anxp2 == null) {
                            anxp2 = axak.a;
                        }
                        access$0003 = anxl.checkIsLite(FormfillTextInputRendererOuterClass.formfillTextInputRenderer);
                        anxp2.a(access$0003);
                        obj = anxp2.h.b(access$0003.d);
                        if (obj == null) {
                            obj = access$0003.b;
                        } else {
                            obj = access$0003.a(obj);
                        }
                        kop = new kph(context, aaas, viewGroup, (arni) obj);
                    } else {
                        anxp = arnb.b;
                        if (anxp == null) {
                            anxp = axak.a;
                        }
                        access$0002 = anxl.checkIsLite(FormfillPhoneNumberInputRendererOuterClass.formfillPhoneNumberInputRenderer);
                        anxp.a(access$0002);
                        if (anxp.h.a(access$0002.d)) {
                            context = this.c;
                            aaas = this.d;
                            anxp2 = arnb.b;
                            if (anxp2 == null) {
                                anxp2 = axak.a;
                            }
                            access$0003 = anxl.checkIsLite(FormfillPhoneNumberInputRendererOuterClass.formfillPhoneNumberInputRenderer);
                            anxp2.a(access$0003);
                            obj = anxp2.h.b(access$0003.d);
                            if (obj == null) {
                                obj = access$0003.b;
                            } else {
                                obj = access$0003.a(obj);
                            }
                            kop = new kov(context, aaas, viewGroup, (arnc) obj);
                        } else {
                            anxp = arnb.b;
                            if (anxp == null) {
                                anxp = axak.a;
                            }
                            access$0002 = anxl.checkIsLite(FormfillCheckboxInputRendererOuterClass.formfillCheckboxInputRenderer);
                            anxp.a(access$0002);
                            if (anxp.h.a(access$0002.d)) {
                                Context context2 = this.c;
                                aaas aaas2 = this.d;
                                anxp2 = arnb.b;
                                if (anxp2 == null) {
                                    anxp2 = axak.a;
                                }
                                anxr access$0004 = anxl.checkIsLite(FormfillCheckboxInputRendererOuterClass.formfillCheckboxInputRenderer);
                                anxp2.a(access$0004);
                                obj = anxp2.h.b(access$0004.d);
                                if (obj == null) {
                                    obj = access$0004.b;
                                } else {
                                    obj = access$0004.a(obj);
                                }
                                kop koi = new koi(context2, aaas2, acvx, viewGroup, (armw) obj);
                            }
                        }
                    }
                }
            }
            if (kop != null) {
                access$000 = anxl.checkIsLite(FormfillInputRendererOuterClass.formfillInputRenderer);
                axak.a(access$000);
                if (axak.h.a(access$000.d)) {
                    access$000 = anxl.checkIsLite(FormfillInputRendererOuterClass.formfillInputRenderer);
                    axak.a(access$000);
                    Object b2 = axak.h.b(access$000.d);
                    if (b2 == null) {
                        b2 = access$000.b;
                    } else {
                        b2 = access$000.a(b2);
                    }
                    arnb arnb2 = (arnb) b2;
                    View a = kop.a();
                    if (a != null) {
                        this.a.add(new kof(kop, arnb2));
                        viewGroup.addView(a);
                    }
                }
            }
        }
    }
}
