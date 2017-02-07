# dumpIntent

when we run an app, we may want to know how the intent send, and what the content in the intent.
this app can do this.

-------------
need:
xposed

-------------
I have used some code from IntentLogger(https://github.com/Drivemode/IntentLogger)

-------------
run log: you can use grep to get the intent you want. the key you can use is action or packageName.
```
02-03 16:28:36.689 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Intent[@4305fa00] content:
02-03 16:28:36.689 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Action   : com.lbe.security.ACTION_SHOW_FLOAT_WINDOW
02-03 16:28:36.689 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Category : null
02-03 16:28:36.689 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Data     : null
02-03 16:28:36.699 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Component: com.lbe.security/com.lbe.security.service.FloatWindowService
02-03 16:28:36.699 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Flags    : 0
02-03 16:28:36.699 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): HasExtras: false
02-03 16:28:36.709 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Intent[@430a9ed0] content:
02-03 16:28:36.709 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Action   : com.lbe.security.ACTION_SHOW_FLOAT_WINDOW
02-03 16:28:36.709 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Category : null
02-03 16:28:36.709 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Data     : null
02-03 16:28:36.719 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Component: com.lbe.security/com.lbe.security.service.FloatWindowService
02-03 16:28:36.719 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Flags    : 0
02-03 16:28:36.719 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): HasExtras: false
02-03 16:28:38.739 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Intent[@43692258] content:
02-03 16:28:38.739 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Action   : com.lbe.security.ACTION_SHOW_FLOAT_WINDOW
02-03 16:28:38.739 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Category : null
02-03 16:28:38.739 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Data     : null
02-03 16:28:38.739 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Component: com.lbe.security/com.lbe.security.service.FloatWindowService
02-03 16:28:38.739 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Flags    : 0
02-03 16:28:38.749 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): HasExtras: false
02-03 16:28:38.759 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Intent[@430aaa50] content:
02-03 16:28:38.759 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Action   : com.lbe.security.ACTION_SHOW_FLOAT_WINDOW
02-03 16:28:38.759 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Category : null
02-03 16:28:38.759 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Data     : null
02-03 16:28:38.759 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Component: com.lbe.security/com.lbe.security.service.FloatWindowService
02-03 16:28:38.759 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Flags    : 0
02-03 16:28:38.759 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): HasExtras: false
02-03 16:28:40.779 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Intent[@42fa2928] content:
02-03 16:28:40.779 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Action   : com.lbe.security.ACTION_SHOW_FLOAT_WINDOW
02-03 16:28:40.779 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Category : null
02-03 16:28:40.789 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Data     : null
02-03 16:28:40.789 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Component: com.lbe.security/com.lbe.security.service.FloatWindowService
02-03 16:28:40.789 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Flags    : 0
02-03 16:28:40.789 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): HasExtras: false
02-03 16:28:40.799 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Intent[@430ab5d0] content:
02-03 16:28:40.799 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Action   : com.lbe.security.ACTION_SHOW_FLOAT_WINDOW
02-03 16:28:40.799 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Category : null
02-03 16:28:40.809 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Data     : null
02-03 16:28:40.809 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Component: com.lbe.security/com.lbe.security.service.FloatWindowService
02-03 16:28:40.809 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Flags    : 0
02-03 16:28:40.809 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): HasExtras: false
02-03 16:28:42.829 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Intent[@431a9140] content:
02-03 16:28:42.829 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Action   : com.lbe.security.ACTION_SHOW_FLOAT_WINDOW
02-03 16:28:42.829 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Category : null
02-03 16:28:42.839 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Data     : null
02-03 16:28:42.839 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Component: com.lbe.security/com.lbe.security.service.FloatWindowService
02-03 16:28:42.839 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Flags    : 0
02-03 16:28:42.839 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): HasExtras: false
02-03 16:28:42.859 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Intent[@430ac150] content:
02-03 16:28:42.859 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Action   : com.lbe.security.ACTION_SHOW_FLOAT_WINDOW
02-03 16:28:42.859 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Category : null
02-03 16:28:42.859 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Data     : null
02-03 16:28:42.859 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Component: com.lbe.security/com.lbe.security.service.FloatWindowService
02-03 16:28:42.859 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Flags    : 0
02-03 16:28:42.869 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): HasExtras: false
02-03 16:28:44.879 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Intent[@430fc630] content:
02-03 16:28:44.879 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Action   : com.lbe.security.ACTION_SHOW_FLOAT_WINDOW
02-03 16:28:44.879 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Category : null
02-03 16:28:44.879 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Data     : null
02-03 16:28:44.879 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Component: com.lbe.security/com.lbe.security.service.FloatWindowService
02-03 16:28:44.889 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Flags    : 0
02-03 16:28:44.889 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): HasExtras: false
02-03 16:28:44.899 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Intent[@430accd0] content:
02-03 16:28:44.899 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Action   : com.lbe.security.ACTION_SHOW_FLOAT_WINDOW
02-03 16:28:44.899 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Category : null
02-03 16:28:44.899 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Data     : null
02-03 16:28:44.899 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Component: com.lbe.security/com.lbe.security.service.FloatWindowService
02-03 16:28:44.899 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Flags    : 0
02-03 16:28:44.899 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): HasExtras: false
02-03 16:28:46.919 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Intent[@43037988] content:
02-03 16:28:46.919 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Action   : com.lbe.security.ACTION_SHOW_FLOAT_WINDOW
02-03 16:28:46.919 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Category : null
02-03 16:28:46.919 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Data     : null
02-03 16:28:46.919 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Component: com.lbe.security/com.lbe.security.service.FloatWindowService
02-03 16:28:46.919 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Flags    : 0
02-03 16:28:46.929 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): HasExtras: false
02-03 16:28:46.939 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Intent[@430ad850] content:
02-03 16:28:46.939 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Action   : com.lbe.security.ACTION_SHOW_FLOAT_WINDOW
02-03 16:28:46.939 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Category : null
02-03 16:28:46.939 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Data     : null
02-03 16:28:46.939 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Component: com.lbe.security/com.lbe.security.service.FloatWindowService
02-03 16:28:46.939 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Flags    : 0
02-03 16:28:46.939 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): HasExtras: false
02-03 16:28:48.959 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Intent[@432d7db0] content:
02-03 16:28:48.969 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Action   : com.lbe.security.ACTION_SHOW_FLOAT_WINDOW
02-03 16:28:48.969 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Category : null
02-03 16:28:48.969 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Data     : null
02-03 16:28:48.969 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Component: com.lbe.security/com.lbe.security.service.FloatWindowService
02-03 16:28:48.969 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Flags    : 0
02-03 16:28:48.969 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): HasExtras: false
02-03 16:28:48.979 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Intent[@430ae3d0] content:
02-03 16:28:48.979 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Action   : com.lbe.security.ACTION_SHOW_FLOAT_WINDOW
02-03 16:28:48.979 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Category : null
02-03 16:28:48.989 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Data     : null
02-03 16:28:48.989 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Component: com.lbe.security/com.lbe.security.service.FloatWindowService
02-03 16:28:48.989 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Flags    : 0
02-03 16:28:48.989 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): HasExtras: false
02-03 16:28:51.009 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Intent[@431abce8] content:
02-03 16:28:51.009 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Action   : com.lbe.security.ACTION_SHOW_FLOAT_WINDOW
02-03 16:28:51.009 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Category : null
02-03 16:28:51.009 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Data     : null
02-03 16:28:51.009 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Component: com.lbe.security/com.lbe.security.service.FloatWindowService
02-03 16:28:51.009 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): Flags    : 0
02-03 16:28:51.009 1568-1568/? V/dumpIntent(startService) (packageName:com.lbe.security): HasExtras: false
02-03 16:28:51.019 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Intent[@430aef50] content:
02-03 16:28:51.019 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Action   : com.lbe.security.ACTION_SHOW_FLOAT_WINDOW
02-03 16:28:51.019 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Category : null
02-03 16:28:51.019 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Data     : null
02-03 16:28:51.019 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Component: com.lbe.security/com.lbe.security.service.FloatWindowService
02-03 16:28:51.019 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): Flags    : 0
02-03 16:28:51.019 15840-15840/? V/dumpIntent(onStartCommand) (packageName:com.lbe.security): HasExtras: false
```

