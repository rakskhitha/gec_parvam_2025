from django.shortcuts import render
from . import models
from . import forms

# Create your views here.

def home(request):
    if request.method=="POST":
        std_form=forms.StudentForm(request.POST)
        if std_form.is_valid():
            std_form.save()
            student_form=forms.StudentForm()

    else:
        student_form=forms.StudentForm()         
    students=models.Student.objects.all()
    context={ "students":students, "student_form":student_form }
    return render(request,"home.html",context)

def about(request):
    return render(request,"about.html")

def contact(request):
    return render(request,"contact.html")