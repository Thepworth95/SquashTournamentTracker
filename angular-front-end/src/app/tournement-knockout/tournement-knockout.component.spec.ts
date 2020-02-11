import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TournementKnockoutComponent } from './tournement-knockout.component';

describe('TournementKnockoutComponent', () => {
  let component: TournementKnockoutComponent;
  let fixture: ComponentFixture<TournementKnockoutComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TournementKnockoutComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TournementKnockoutComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
