package defpackage;

import android.text.TextUtils;
import com.google.android.youtube.R;

/* renamed from: yrm */
final /* synthetic */ class yrm implements xsd {
    private final yrk a;

    yrm(yrk yrk) {
        this.a = yrk;
    }

    public final void a(Object obj) {
        yrk yrk = this.a;
        aadz aadz = (aadz) obj;
        ykv ykv = (ykv) aadz.c();
        if (ykv != null && ykv.b()) {
            amul a;
            yrk.j = ykv;
            int ordinal = ykv.a(ykv, (ymn) aadz.e().a("technodrome_metadata", ymn.c.getParserForType())).ordinal();
            if (ordinal == 1) {
                a = amul.a(new yrd(yrg.CHAT_WITH, ykv.getName()), new yrd(yrg.GO_TO_CHANNEL, new Object[0]), new yrd(yrg.REMOVE_CONTACT, new Object[0]), new yrd(yrg.BLOCK, new Object[0]));
            } else if (ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal == 5) {
                        a = amul.a(new yrd(yrg.GO_TO_CHANNEL, new Object[0]), new yrd(yrg.UNBLOCK, new Object[0]));
                    } else if (ordinal == 6) {
                        a = amul.a(new yrd(yrg.GO_TO_CHANNEL, new Object[0]));
                    } else if (ordinal != 7) {
                        a = amul.a(new yrd(yrg.GO_TO_CHANNEL, new Object[0]), new yrd(yrg.SEND_INVITE, new Object[0]), new yrd(yrg.BLOCK, new Object[0]));
                    }
                }
                a = amul.a(new yrd(yrg.GO_TO_CHANNEL, new Object[0]), new yrd(yrg.ACCEPT_INVITE, new Object[0]), new yrd(yrg.BLOCK, new Object[0]));
            } else {
                a = amul.a(new yrd(yrg.GO_TO_CHANNEL, new Object[0]), new yrd(yrg.RESEND_INVITE, new Object[0]), new yrd(yrg.CANCEL_INVITE, new Object[0]));
            }
            amuo amuo = new amuo();
            amxn amxn = (amxn) a.listIterator();
            while (amxn.hasNext()) {
                yrd yrd = (yrd) amxn.next();
                switch (yrd.a.ordinal()) {
                    case 0:
                        if (!TextUtils.isEmpty(ykv.getAcceptInviteToken())) {
                            amuo.c(yrd);
                            break;
                        }
                        break;
                    case 1:
                        if (!TextUtils.isEmpty(ykv.getBlockToken())) {
                            amuo.c(yrd);
                            break;
                        }
                        break;
                    case 2:
                        if (!TextUtils.isEmpty(ykv.getCancelInviteToken())) {
                            amuo.c(yrd);
                            break;
                        }
                        break;
                    case 3:
                        if (!TextUtils.isEmpty(ykv.getSerializedContactInvitee())) {
                            amuo.c(yrd);
                            break;
                        }
                        break;
                    case 4:
                        if (!TextUtils.isEmpty(ykv.getExternalChannelId())) {
                            amuo.c(yrd);
                            break;
                        }
                        break;
                    case 5:
                        if (!TextUtils.isEmpty(ykv.getRemoveToken())) {
                            amuo.c(yrd);
                            break;
                        }
                        break;
                    case 6:
                        if (!TextUtils.isEmpty(ykv.getReinviteToken())) {
                            amuo.c(yrd);
                            break;
                        }
                        break;
                    case 7:
                        if (!TextUtils.isEmpty(ykv.getInviteToken())) {
                            amuo.c(yrd);
                            break;
                        }
                        break;
                    case 8:
                        if (!TextUtils.isEmpty(ykv.getUnblockToken())) {
                            amuo.c(yrd);
                            break;
                        }
                        break;
                    default:
                        break;
                }
            }
            a = amuo.a();
            yyp yyp = yrk.g;
            yyp.d.a(yyp.a, ykv.getAvatar(), akko.g.g().a((int) R.drawable.product_logo_avatar_circle_grey_color_120).a());
            yyp = yrk.g;
            yyp.b.setText(ykv.getName());
            yrb yrb = yrk.i;
            ahc a2 = ahb.a(new yre(yrb, a));
            yrb.c.clear();
            yrb.c.addAll(a);
            a2.a(yrb);
            yrk.g.a(true);
            yrk.g.b(false);
        }
    }
}
