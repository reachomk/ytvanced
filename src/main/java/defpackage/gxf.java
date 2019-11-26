package defpackage;

import android.app.AlertDialog;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.playlist.PrivacySpinner;
import com.google.android.libraries.youtube.common.ui.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.PlaylistEditEndpointOuterClass$PlaylistEditEndpoint;
import com.google.protos.youtube.api.innertube.PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint;

/* renamed from: gxf */
public final class gxf extends fja implements xcp {
    public afpu ae;
    public abfm af;
    public abgc ag;
    public xoi ah;
    public xci ai;
    public akkq aj;
    public String ak;
    public ajye al;
    public LoadingFrameLayout am;
    public AlertDialog an;
    private PlaylistEditEndpointOuterClass$PlaylistEditEndpoint ao;
    private apxu ap;
    private ImageView aq;
    private EditText ar;
    private EditText as;
    private PrivacySpinner at;
    private gxo au;
    private View av;
    private TextView aw;
    private float ax;
    private float ay;

    public static fiw a(apxu apxu) {
        Object obj;
        amqw.a((Object) apxu);
        anxr access$000 = anxl.checkIsLite(PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.playlistEditorEndpoint);
        apxu.a(access$000);
        amqw.a(apxu.h.a(access$000.d));
        access$000 = anxl.checkIsLite(PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.playlistEditorEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        String str = ((PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint) obj).b;
        Bundle b2 = fiw.b();
        b2.putString("playlist_id", str);
        return fiw.a(gxf.class, apxu, b2);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ((gxp) xse.a(this.a)).a(this);
        this.am = (LoadingFrameLayout) layoutInflater.inflate(R.layout.playlist_editor_fragment, viewGroup, false);
        this.aq = (ImageView) this.am.findViewById(R.id.thumbnail);
        this.ar = (EditText) this.am.findViewById(R.id.title_edit);
        this.as = (EditText) this.am.findViewById(R.id.description_edit);
        this.at = (PrivacySpinner) this.am.findViewById(R.id.privacy_edit);
        this.at.a(flr.PLAYLIST);
        this.au = new gxo(this);
        this.av = this.am.findViewById(R.id.collaboration_section_entry);
        this.aw = (TextView) this.am.findViewById(R.id.collaboration_section_entry_title);
        this.ax = this.am.getAlpha();
        TypedValue typedValue = new TypedValue();
        this.am.getContext().getTheme().resolveAttribute(16842803, typedValue, true);
        this.ay = typedValue.getFloat();
        String str = "navigation_endpoint";
        String str2 = "playlist_id";
        if (bundle != null) {
            this.ak = bundle.getString(str2);
            this.ap = aaax.a(bundle.getByteArray(str));
            try {
                this.al = (ajye) aocf.mergeFrom(new ajye(), bundle.getByteArray("playlist_settings_editor"));
            } catch (aocg unused) {
                this.al = null;
            }
            gxk gxk = (gxk) bundle.getParcelable("editor_state");
            ajye ajye = this.al;
            if (ajye != null) {
                a(ajye, gxk);
                this.am.b();
                t().a(acwl.ah, this.ap, null);
                return this.am;
            }
        }
        bundle = this.j;
        this.ak = bundle.getString(str2);
        this.ap = aaax.a(bundle.getByteArray(str));
        afsw gxm = new gxm(this);
        this.am.a(new gxe(this, gxm));
        a(gxm);
        t().a(acwl.ah, this.ap, null);
        return this.am;
    }

    public final void e(Bundle bundle) {
        bundle.putString("playlist_id", this.ak);
        bundle.putByteArray("navigation_endpoint", this.ap.toByteArray());
        ajye ajye = this.al;
        if (ajye != null) {
            bundle.putByteArray("playlist_settings_editor", aocf.toByteArray(ajye));
            bundle.putParcelable("editor_state", ak());
        }
    }

    public final void W_() {
        super.W_();
        if (this.ae.a()) {
            this.ai.a((Object) this);
        } else {
            this.ac.a(false);
        }
    }

    public final void B() {
        super.B();
        if (!this.ae.a()) {
            this.ac.a(false);
        }
    }

    public final void ad_() {
        super.ad_();
        xpr.a(this.K.findFocus());
    }

    public final void N_() {
        super.N_();
        this.ai.b(this);
    }

    public final ezz W() {
        if (this.c == null) {
            faf i = this.ab.i();
            i.a = q().getString(R.string.edit_playlist_form_title);
            i.a(amuw.a(this.au));
            this.c = i.a();
        }
        return this.c;
    }

    public final void a(afsw afsw) {
        this.am.a();
        aaml b = this.af.b();
        b.c(this.ak);
        b.a(zzp.b);
        this.af.a(b, afsw);
    }

    public final void a(ajye ajye, gxk gxk) {
        if (al()) {
            EditText editText;
            arlf arlf;
            aygk aygk;
            ajyb a = gxq.a(ajye);
            if (gxk != null) {
                this.ar.setText(gxk.a);
                this.as.setText(gxk.b);
                this.at.a(gxk.c);
            } else {
                editText = this.ar;
                arlf = a.a.b;
                if (arlf == null) {
                    arlf = arlf.e;
                }
                editText.setText(arlf.c);
                editText = this.as;
                arlf = a.b.b;
                if (arlf == null) {
                    arlf = arlf.e;
                }
                editText.setText(arlf.c);
                this.at.a(gxf.a(a));
            }
            editText = this.ar;
            arlf = a.a.b;
            if (arlf == null) {
                arlf = arlf.e;
            }
            gxf.a(editText, arlf.d);
            editText = this.as;
            arlf = a.b.b;
            if (arlf == null) {
                arlf = arlf.e;
            }
            gxf.a(editText, arlf.d);
            akkq akkq = this.aj;
            ImageView imageView = this.aq;
            awkv awkv = a.d;
            int i = awkv.a;
            PlaylistEditEndpointOuterClass$PlaylistEditEndpoint playlistEditEndpointOuterClass$PlaylistEditEndpoint = null;
            if ((i & 2) != 0) {
                awkt awkt = awkv.c;
                if (awkt == null) {
                    awkt = awkt.c;
                }
                aygk = awkt.b;
                if (aygk == null) {
                    aygk = aygk.f;
                }
            } else if ((i & 1) != 0) {
                awkx awkx = awkv.b;
                if (awkx == null) {
                    awkx = awkx.c;
                }
                aygk = awkx.b;
                if (aygk == null) {
                    aygk = aygk.f;
                }
            } else {
                aygk = null;
            }
            akkq.a(imageView, aygk);
            awkb b = gxq.b(ajye);
            if (b != null) {
                arml arml;
                TextView textView = this.aw;
                if ((b.a & 1) != 0) {
                    arml = b.b;
                    if (arml == null) {
                        arml = arml.f;
                    }
                } else {
                    arml = null;
                }
                textView.setText(ajqy.a(arml));
                this.av.setVisibility(0);
                this.av.setOnClickListener(new gxh(this));
                this.at.setOnItemSelectedListener(new gxg(this));
            }
            f();
            apxu apxu = ajye.a;
            if (apxu != null) {
                anxr access$000 = anxl.checkIsLite(PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.playlistEditEndpoint);
                apxu.a(access$000);
                if (apxu.h.a(access$000.d)) {
                    apxu apxu2 = ajye.a;
                    anxr access$0002 = anxl.checkIsLite(PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.playlistEditEndpoint);
                    apxu2.a(access$0002);
                    Object b2 = apxu2.h.b(access$0002.d);
                    if (b2 == null) {
                        b2 = access$0002.b;
                    } else {
                        b2 = access$0002.a(b2);
                    }
                    playlistEditEndpointOuterClass$PlaylistEditEndpoint = (PlaylistEditEndpointOuterClass$PlaylistEditEndpoint) b2;
                }
                this.ao = playlistEditEndpointOuterClass$PlaylistEditEndpoint;
            }
        }
    }

    private static void a(EditText editText, int i) {
        if (i > 0) {
            editText.setFilters(new InputFilter[]{new LengthFilter(i)});
        }
    }

    public final void f() {
        boolean z = this.at.b() != awnx.PRIVATE;
        this.av.setEnabled(z);
        this.av.setAlpha(!z ? this.ay : this.ax);
    }

    private final gxk ak() {
        return new gxk(this.ar.getText(), this.as.getText(), this.at.b());
    }

    public final void b(afsw afsw) {
        if (this.ao != null && al()) {
            abgh a = this.ag.a();
            a.a = this.ao.b;
            a.g();
            gxk ak = ak();
            ajyb a2 = gxq.a(this.al);
            String trim = xvd.a(ak.a).toString().trim();
            if (TextUtils.isEmpty(trim)) {
                xpr.a(this.a, (int) R.string.edit_video_error_empty_title, 0);
                return;
            }
            awhm awhm;
            awhn awhn;
            arlf arlf = a2.a.b;
            if (arlf == null) {
                arlf = arlf.e;
            }
            if (!TextUtils.equals(trim, arlf.c)) {
                awhm = (awhm) awhn.l.createBuilder();
                awhm.a(7);
                awhm.copyOnWrite();
                awhn = (awhn) awhm.instance;
                if (trim != null) {
                    awhn.a |= 128;
                    awhn.g = trim;
                    a.b.add((awhn) ((anxl) awhm.build()));
                } else {
                    throw new NullPointerException();
                }
            }
            trim = xvd.a(ak.b).toString().trim();
            arlf = a2.b.b;
            if (arlf == null) {
                arlf = arlf.e;
            }
            if (!TextUtils.equals(trim, arlf.c)) {
                awhm = (awhm) awhn.l.createBuilder();
                awhm.a(8);
                awhm.copyOnWrite();
                awhn = (awhn) awhm.instance;
                if (trim != null) {
                    awhn.a |= 256;
                    awhn.h = trim;
                    a.b.add((awhn) ((anxl) awhm.build()));
                } else {
                    throw new NullPointerException();
                }
            }
            awnx awnx = ak.c;
            if (awnx != gxf.a(a2)) {
                awhm awhm2 = (awhm) awhn.l.createBuilder();
                awhm2.a(10);
                awhm2.copyOnWrite();
                awhn awhn2 = (awhn) awhm2.instance;
                if (awnx != null) {
                    awhn2.a |= 1024;
                    awhn2.i = awnx.d;
                    a.b.add((awhn) ((anxl) awhm2.build()));
                } else {
                    throw new NullPointerException();
                }
            }
            if (a.b.size() <= 0) {
                afsw.a(null);
            } else {
                this.ag.a(a, afsw);
            }
        }
    }

    private final boolean al() {
        ajyb a = gxq.a(this.al);
        if (a != null) {
            awkj awkj = a.a;
            if (!(awkj == null || (awkj.a & 1) == 0)) {
                awkj = a.b;
                if (!(awkj == null || (awkj.a & 1) == 0)) {
                    akau akau = a.c;
                    if (akau != null) {
                        ajud ajud = akau.a;
                        if (ajud != null) {
                            ajug ajug = ajud.a;
                            if (!(ajug == null || ajug.a == null)) {
                                try {
                                    gxf.a(a);
                                    return true;
                                } catch (IllegalStateException unused) {
                                    xtl.c("Privacy status is not set.");
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        xtl.c("Required fields are missing in playlistSettingsEditorRenderer.");
        return false;
    }

    public static awnx a(ajyb ajyb) {
        for (aqyb aqyb : ajyb.c.a.a.a.b) {
            aqyf aqyf = aqyb.e;
            if (aqyf == null) {
                aqyf = aqyf.k;
            }
            if (aqyf.g) {
                aqyf aqyf2 = aqyb.e;
                if (aqyf2 == null) {
                    aqyf2 = aqyf.k;
                }
                awnx a = awnx.a(aqyf2.b == 6 ? ((Integer) aqyf2.c).intValue() : 0);
                if (a != null) {
                    return a;
                }
                throw new IllegalStateException("Unknown privacy status");
            }
        }
        throw new IllegalStateException();
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{afqh.class};
        } else if (i == 0) {
            this.ac.a(false);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
