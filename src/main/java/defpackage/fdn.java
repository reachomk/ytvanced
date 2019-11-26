package defpackage;

import android.support.design.textfield.TextInputLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsContainer;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsHorizontalSurvey;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsSurvey;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: fdn */
final class fdn implements fbt {
    public final aaas a;
    public final HatsSurvey b;
    public final Map c = new HashMap();
    private final akvp d;
    private final HatsContainer e;
    private final YouTubeTextView f;
    private final HatsHorizontalSurvey g;
    private fbv h;

    fdn(akvp akvp, aaas aaas, HatsContainer hatsContainer) {
        this.d = akvp;
        this.a = aaas;
        this.e = hatsContainer;
        fbz a = hatsContainer.a();
        if (a.a == null) {
            a.a = (YouTubeTextView) a.a(R.layout.hats_prompt);
        }
        this.f = a.a;
        this.g = hatsContainer.a().a();
        a = hatsContainer.a();
        if (a.b == null) {
            a.b = (HatsSurvey) a.a(R.layout.hats_survey);
        }
        this.b = a.b;
    }

    public final void a(fdl fdl) {
        if (fdl.i() != null) {
            fdl.i().a(fdl.l());
        }
        a(0);
    }

    public final void a(int i) {
        this.c.clear();
        fbv fbv = this.h;
        if (fbv != null) {
            fbv.a(i);
            this.h = null;
        }
    }

    private static boolean b(fdl fdl) {
        if (fdl.d() == 1) {
            ayau ayau = fdl.f().b;
            if (ayau == null) {
                ayau = ayau.c;
            }
            int a = ayaw.a(ayau.b);
            if (a == 0 || a != 3) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ View a(fbr fbr, fbv fbv) {
        fdl fdl = (fdl) fbr;
        this.h = fbv;
        if (fdl.d() != 3) {
            this.e.a(new fdq(this, fdl));
        }
        if (fdn.b(fdl)) {
            xpr.a(this.f, fdl.j());
            this.b.c(fdl.j());
        } else {
            this.g.c(fdl.j());
        }
        int d = fdl.d();
        aphg aphg = null;
        HatsSurvey hatsSurvey;
        List arrayList;
        aphj aphj;
        if (d == 1) {
            ayao f = fdl.f();
            boolean b = fdn.b(fdl);
            if (b) {
                hatsSurvey = this.b;
            } else {
                hatsSurvey = this.g;
            }
            YouTubeTextView youTubeTextView = b ? this.f : null;
            hatsSurvey.a(null, null);
            anyd<ayas> anyd = f.j;
            ViewGroup viewGroup = hatsSurvey.a;
            arrayList = new ArrayList(anyd.size());
            for (ayas ayas : anyd) {
                if (ayas.a == 84469192) {
                    ayam ayam = (ayam) ayas.b;
                    View a = fed.a(viewGroup.getContext(), viewGroup, b);
                    fed.a(a, ayam, this.d, new fdt(this, fdl, ayam));
                    arrayList.add(a);
                }
            }
            hatsSurvey.a(arrayList);
            if (!b) {
                this.g.a(fed.a(f.j));
                this.g.b(fed.b(f.j));
            }
            this.e.a(hatsSurvey);
            this.e.a(youTubeTextView);
        } else if (d == 2) {
            axzw g = fdl.g();
            anyd<axzy> anyd2 = g.g;
            ViewGroup viewGroup2 = this.b.a;
            this.c.clear();
            LayoutInflater from = LayoutInflater.from(viewGroup2.getContext());
            arrayList = new ArrayList(anyd2.size());
            for (axzy axzy : anyd2) {
                if ((axzy.a & 1) != 0) {
                    arml arml;
                    axzu axzu = axzy.b;
                    if (axzu == null) {
                        axzu = axzu.f;
                    }
                    apxu apxu = axzu.c;
                    if (apxu == null) {
                        apxu = apxu.d;
                    }
                    fec fec = new fec(apxu, axzu.e);
                    CheckBox checkBox = (CheckBox) from.inflate(R.layout.hats_checkbox_survey_option, viewGroup2, false);
                    if ((axzu.a & 1) != 0) {
                        arml = axzu.b;
                        if (arml == null) {
                            arml = arml.f;
                        }
                    } else {
                        arml = null;
                    }
                    checkBox.setText(ajqy.a(arml));
                    checkBox.setOnClickListener(new fdw(this, fec));
                    arrayList.add(checkBox);
                    this.c.put(fec, checkBox);
                }
            }
            this.b.a(arrayList);
            aphj aphj2 = g.j;
            if (aphj2 == null) {
                aphj2 = aphj.d;
            }
            if ((aphj2.a & 1) != 0) {
                aphj = g.j;
                if (aphj == null) {
                    aphj = aphj.d;
                }
                aphg = aphj.b;
                if (aphg == null) {
                    aphg = aphg.s;
                }
            }
            this.b.a(aphg, new fdp(this, fdl, aphg));
            this.e.a(this.b);
            this.e.a(this.f);
        } else if (d == 3) {
            arml arml2;
            arml arml3;
            ayaa h = fdl.h();
            ViewGroup viewGroup3 = this.b.a;
            View inflate = LayoutInflater.from(viewGroup3.getContext()).inflate(R.layout.hats_free_text_survey_option, viewGroup3, false);
            TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R.id.input_layout);
            EditText editText = (EditText) textInputLayout.findViewById(R.id.input);
            if ((2 & h.a) != 0) {
                arml2 = h.c;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
            } else {
                arml2 = null;
            }
            editText.setHint(ajqy.a(arml2));
            editText.setOnClickListener(fdv.a);
            editText.addTextChangedListener(new fdz(this, textInputLayout));
            amur a2 = amur.a("ShowSystemInfoDialogCommandResolver.SHOW_SYSTEM_INFO_DIALOG_COMMAND_ORIGIN_SURVEY_KEY", fdl.e());
            YouTubeTextView youTubeTextView2 = (YouTubeTextView) inflate.findViewById(R.id.disclaimer);
            youTubeTextView2.d();
            if ((h.a & 4) != 0) {
                arml3 = h.d;
                if (arml3 == null) {
                    arml3 = arml.f;
                }
            } else {
                arml3 = null;
            }
            youTubeTextView2.setText(ajqy.a(arml3, new fdy(this, a2)));
            editText.setOnFocusChangeListener(new fdx(youTubeTextView2));
            hatsSurvey = this.b;
            hatsSurvey.a.removeAllViews();
            hatsSurvey.a.addView(inflate);
            EditText editText2 = (EditText) ((TextInputLayout) inflate.findViewById(R.id.input_layout)).findViewById(R.id.input);
            aphj aphj3 = h.f;
            if (aphj3 == null) {
                aphj3 = aphj.d;
            }
            if ((aphj3.a & 1) != 0) {
                aphj = h.f;
                if (aphj == null) {
                    aphj = aphj.d;
                }
                aphg = aphj.b;
                if (aphg == null) {
                    aphg = aphg.s;
                }
            }
            this.b.a(aphg, new fdr(this, aphg, editText2));
            this.b.a(false);
            this.e.a(new fdu(this, editText2, viewGroup3, fdl));
            this.e.a(this.b);
            this.e.a(this.f);
        } else {
            throw new AssertionError();
        }
        HatsContainer hatsContainer = this.e;
        hatsContainer.b = true;
        hatsContainer.b();
        return this.e;
    }
}
