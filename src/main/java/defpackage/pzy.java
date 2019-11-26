package defpackage;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.youtube.R;

/* renamed from: pzy */
public final class pzy {
    private static final aac a = new aac();

    public static String a(Context context, int i) {
        Resources resources = context.getResources();
        String str = "GoogleApiAvailability";
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e(str, "An invalid account was specified when connecting. Please provide a valid account.");
                return pzy.a(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e(str, "Network error occurred. Please retry request later.");
                return pzy.a(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e(str, "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e(str, "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e(str, "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e(str, "The application is not licensed to the user.");
                return null;
            case 16:
                Log.e(str, "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e(str, "The specified account could not be signed in.");
                return pzy.a(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e(str, "The current user profile is restricted and could not use authenticated features.");
                return pzy.a(context, "common_google_play_services_restricted_profile_title");
            default:
                StringBuilder stringBuilder = new StringBuilder(33);
                stringBuilder.append("Unexpected error code ");
                stringBuilder.append(i);
                Log.e(str, stringBuilder.toString());
                return null;
        }
    }

    public static String b(Context context, int i) {
        String a;
        if (i == 6) {
            a = pzy.a(context, "common_google_play_services_resolution_required_title");
        } else {
            a = pzy.a(context, i);
        }
        return a == null ? context.getResources().getString(R.string.common_google_play_services_notification_ticker) : a;
    }

    public static String c(Context context, int i) {
        Resources resources = context.getResources();
        String b = pzy.b(context);
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, new Object[]{b});
        } else if (i != 2) {
            if (i == 3) {
                return resources.getString(R.string.common_google_play_services_enable_text, new Object[]{b});
            } else if (i == 5) {
                return pzy.a(context, "common_google_play_services_invalid_account_text", b);
            } else {
                if (i == 7) {
                    return pzy.a(context, "common_google_play_services_network_error_text", b);
                }
                if (i == 9) {
                    return resources.getString(R.string.common_google_play_services_unsupported_text, new Object[]{b});
                } else if (i == 20) {
                    return pzy.a(context, "common_google_play_services_restricted_profile_text", b);
                } else {
                    switch (i) {
                        case 16:
                            return pzy.a(context, "common_google_play_services_api_unavailable_text", b);
                        case 17:
                            return pzy.a(context, "common_google_play_services_sign_in_failed_text", b);
                        case 18:
                            return resources.getString(R.string.common_google_play_services_updating_text, new Object[]{b});
                        default:
                            return resources.getString(R.string.common_google_play_services_unknown_issue, new Object[]{b});
                    }
                }
            }
        } else if (qbc.b(context)) {
            return resources.getString(R.string.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(R.string.common_google_play_services_update_text, new Object[]{b});
        }
    }

    public static String d(Context context, int i) {
        if (i != 6) {
            return pzy.c(context, i);
        }
        return pzy.a(context, "common_google_play_services_resolution_required_text", pzy.b(context));
    }

    public static String e(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_button);
        }
        if (i == 2) {
            return resources.getString(R.string.common_google_play_services_update_button);
        }
        if (i != 3) {
            return resources.getString(17039370);
        }
        return resources.getString(R.string.common_google_play_services_enable_button);
    }

    private static String b(Context context) {
        String packageName = context.getPackageName();
        try {
            qpi a = qph.a(context);
            context = a.a.getPackageManager().getApplicationLabel(a.a.getPackageManager().getApplicationInfo(packageName, 0)).toString();
            return context;
        } catch (NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return !TextUtils.isEmpty(str) ? str : packageName;
        }
    }

    private static String a(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String a = pzy.a(context, str);
        if (a == null) {
            a = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, a, new Object[]{str2});
    }

    private static String a(Context context, String str) {
        synchronized (a) {
            String str2 = (String) a.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources resourcesForApplication;
            try {
                resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
            } catch (NameNotFoundException unused) {
                resourcesForApplication = null;
            }
            if (resourcesForApplication == null) {
                return null;
            }
            int identifier = resourcesForApplication.getIdentifier(str, "string", "com.google.android.gms");
            String str3;
            String str4;
            if (identifier == 0) {
                str3 = "GoogleApiAvailability";
                str4 = "Missing resource: ";
                str = String.valueOf(str);
                if (str.length() == 0) {
                    str = new String(str4);
                } else {
                    str = str4.concat(str);
                }
                Log.w(str3, str);
                return null;
            }
            str3 = resourcesForApplication.getString(identifier);
            if (TextUtils.isEmpty(str3)) {
                str3 = "GoogleApiAvailability";
                str4 = "Got empty resource: ";
                str = String.valueOf(str);
                if (str.length() == 0) {
                    str = new String(str4);
                } else {
                    str = str4.concat(str);
                }
                Log.w(str3, str);
                return null;
            }
            a.put(str, str3);
            return str3;
        }
    }

    public static String a(Context context) {
        return context.getResources().getString(R.string.common_google_play_services_notification_channel_name);
    }
}
