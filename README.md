# Yocto Linux Basics

## Creating a meta Layer in Yocto linux

```bash
cd <yoctotutor>
source sources/poky/oe-init-build-env
bitbake-layers create-layer ../meta-mylayer
bitbake-layers add-layer ../meta-mylayer
```

## Important tutorials

[Makefiles tutorial](https://makefiletutorial.com/)

[cmakefiles tutorial](https://medium.com/@onur.dundar1/cmake-tutorial-585dd180109b)

[libraries tutorial](https://medium.com/@The_Mad_Zaafa/creating-and-using-dynamic-libraries-c-a9d344822ed0)


[autotools tutorial](https://earthly.dev/blog/autoconf/)

## How to Create a Patch

```bash
cd <workspace_directory>
git init

git add .
git commit -m "Describe your changes here"

git format-patch -1 HEAD
Or
git format-patch -1 
```
add your patch in recipes

`SRC_URI += "file://0001-Describe-your-changes-here.patch`

## Dynamic lib creation

[refer this](https://medium.com/@4318_26766/creating-and-using-dynamic-libraries-in-c-language-912b078b7c52)

## Compiling C source code using autotools
[Refer for more understanding](https://medium.com/@Mehul2802/compiling-c-source-code-using-autotools-6285a033912b

https://www.gnu.org/software/automake/manual/html_node/amhello_0027s-Makefile_002eam-Setup-Explained.html

https://earthly.dev/blog/autoconf/)