import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OneFacultyComponent } from './one-faculty.component';

describe('OneFacultyComponent', () => {
  let component: OneFacultyComponent;
  let fixture: ComponentFixture<OneFacultyComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ OneFacultyComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(OneFacultyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
