import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Exp10YearComponent } from './exp10-year.component';

describe('Exp10YearComponent', () => {
  let component: Exp10YearComponent;
  let fixture: ComponentFixture<Exp10YearComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ Exp10YearComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Exp10YearComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
